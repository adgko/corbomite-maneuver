package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class SwordBehavior implements CombatBehavior {

	public SwordBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		if(dado.tirarDado(20)==20) {
			System.out.printf("pifia en la tirada");
			System.out.printf("el personaje se hace "+Float.toString(dado.tirarDado(10))+"da�os");
			jtextfield.setText("pifia en el ataque. recibe "+Float.toString(dado.tirarDado(10))+" da�os");
		}
		else if(dado.tirarDado(20)==1) {
			System.out.printf("golpe cr�tico");
			System.out.printf("el personaje hace "+Float.toString(2*(dado.tirarDado(10)))+"da�os");
			jtextfield.setText("GOLPE CR�TICO. hace "+Float.toString(2*(dado.tirarDado(10)))+" da�os");
		}
		else if(dado.tirarDado(20)<pelea) {
			System.out.printf("acierta. hace "+Float.toString(dado.tirarDado(10))+" da�o");
			jtextfield.setText("acierta. hace "+Float.toString(dado.tirarDado(10))+" da�os");
		}
		else System.out.printf("falla el ataque");
			jtextfield.setText("fall el ataque");
	}
}

