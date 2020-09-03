package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class StaffBehavior implements CombatBehavior{

	public StaffBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		int resultado = dado.tirarDado(20);
		
		if(resultado==1) {
			System.out.printf("golpe crítico");
			System.out.printf("el personaje hace "+2*(dado.tirarDado(8))+"daños");
			jtextfield.setText("GOLPE CRÍTICO. hace "+2*(dado.tirarDado(8))+" daños");
		}
		else {
			System.out.printf("acierta. hace "+dado.tirarDado(8)+" daño");
			jtextfield.setText("acierta. hace "+dado.tirarDado(8)+" daños");
		}
	}
		
}
