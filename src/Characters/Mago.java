package Characters;



public class Mago extends Personaje{

	public Mago(String name, String category, String weapon, String sex, int ability, int combat, int clever, int health) {
		super(name, category, weapon, sex, ability, combat, clever+2, health);
	}

}
