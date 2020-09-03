package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class DaggerBehavior implements CombatBehavior {

	public DaggerBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		int resultado = dado.tirarDado(20);
		if(resultado==20) {
			System.out.printf("pifia en la tirada");
			System.out.printf("el personaje se hace "+Float.toString(dado.tirarDado(6))+"da�os");
			jtextfield.setText("pifia en el ataque. recibe "+Float.toString(dado.tirarDado(6))+" da�os");
		}
		else if(resultado==1) {
			System.out.printf("golpe cr�tico");
			System.out.printf("el personaje hace "+Float.toString(2*(dado.tirarDado(6)))+"da�os");
			jtextfield.setText("GOLPE CR�TICO. hace "+Float.toString(2*(dado.tirarDado(6)))+" da�os");
		}
		else if(resultado<pelea) {
			System.out.printf("acierta. hace "+Float.toString(dado.tirarDado(6))+" da�o");
			jtextfield.setText("acierta. hace "+Float.toString(dado.tirarDado(6))+" da�os");
		}
		else System.out.printf("falla el ataque");
			jtextfield.setText("fall el ataque");
	}
}

