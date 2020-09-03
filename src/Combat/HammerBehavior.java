package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class HammerBehavior implements CombatBehavior {

	public HammerBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		int resultado = dado.tirarDado(20);
		if(resultado==20) {
			System.out.printf("pifia en la tirada");
			System.out.printf("el personaje se hace "+Float.toString(dado.tirarDado(12))+"da�os");
			jtextfield.setText("pifia en el ataque. recibe "+Float.toString(dado.tirarDado(10))+" da�os");
		}
		else if(resultado==1) {
			System.out.printf("golpe cr�tico");
			System.out.printf("el personaje hace "+Float.toString(2*(dado.tirarDado(12)))+"da�os");
			jtextfield.setText("GOLPE CR�TICO. hace "+Float.toString(2*(dado.tirarDado(12)))+" da�os");
		}
		else if(resultado<pelea) {
			System.out.printf("acierta. hace "+Float.toString(dado.tirarDado(12))+" da�o");
			jtextfield.setText("acierta. hace "+Float.toString(dado.tirarDado(12))+" da�os");
		}
		else System.out.printf("falla el ataque");
			jtextfield.setText("fall el ataque");
	}
}

