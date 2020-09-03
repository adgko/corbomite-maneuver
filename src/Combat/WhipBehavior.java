package Combat;

import javax.swing.JTextField;

import Dados.Dado;

public class WhipBehavior implements CombatBehavior {

	public WhipBehavior() {}
	public void fight(int pelea, JTextField jtextfield) {
		Dado dado = new Dado();
		int resultado = dado.tirarDado(20);
		if(resultado>17) {
			System.out.printf("pifia en la tirada");
			System.out.printf("el personaje se hace "+Float.toString(dado.tirarDado(10))+"daños");
			jtextfield.setText("pifia en el ataque. recibe "+Float.toString(dado.tirarDado(10))+" daños");
		}
		else if(resultado==1) {
			System.out.printf("golpe crítico");
			System.out.printf("el personaje hace "+Float.toString(2*(dado.tirarDado(10)))+"daños");
			jtextfield.setText("GOLPE CRÍTICO. hace "+Float.toString(2*(dado.tirarDado(10)))+" daños");
		}
		else if(resultado<pelea-2) {
			System.out.printf("acierta. hace "+Float.toString(dado.tirarDado(10))+" daño");
			jtextfield.setText("acierta. hace "+Float.toString(dado.tirarDado(10))+" daños");
		}
		else System.out.printf("falla el ataque");
			jtextfield.setText("falla el ataque");
	}
}

