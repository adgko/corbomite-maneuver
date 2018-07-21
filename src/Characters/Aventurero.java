package Characters;


public class Aventurero extends Personaje {	//el aventurero tiene +1 a todos sus atributos
	
	public Aventurero(String name, String category, String weapon, String sex, int ability, int combat, int clever, int health) {						//pasar todos los datos al constructor y de ahí sacar
		super(name, category, weapon, sex, ability+1, combat+1, clever+1, health);
	}
}
