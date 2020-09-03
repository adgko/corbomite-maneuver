package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class StaffBehavior implements CombatBehavior{

	public StaffBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		int resultado = dado.tirarDado(20);
		
		if(resultado==1) {
			System.out.printf("golpe cr�tico");
			System.out.printf("el personaje hace "+2*(dado.tirarDado(8))+"da�os");
			jtextfield.setText("GOLPE CR�TICO. hace "+2*(dado.tirarDado(8))+" da�os");
		}
		else {
			System.out.printf("acierta. hace "+dado.tirarDado(8)+" da�o");
			jtextfield.setText("acierta. hace "+dado.tirarDado(8)+" da�os");
		}
	}
		
}
