package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class StaffBehavior implements CombatBehavior{

	public StaffBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		if(dado.tirarDado(20)==20) {
			System.out.printf("pifia en la tirada");
			System.out.printf("el personaje se hace "+dado.tirarDado(8)+"da�os");
			jtextfield.setText("pifia en el ataque. recibe "+dado.tirarDado(8)+" da�os");
		}
		else if(dado.tirarDado(20)==1) {
			System.out.printf("golpe cr�tico");
			System.out.printf("el personaje hace "+2*(dado.tirarDado(8))+"da�os");
			jtextfield.setText("GOLPE CR�TICO. hace "+2*(dado.tirarDado(8))+" da�os");
		}
		else if(dado.tirarDado(20)<pelea) {
			System.out.printf("acierta. hace "+dado.tirarDado(8)+" da�o");
			jtextfield.setText("acierta. hace "+dado.tirarDado(8)+" da�os");
		}
		else System.out.printf("falla el ataque");
			jtextfield.setText("fall el ataque");
	}
}
