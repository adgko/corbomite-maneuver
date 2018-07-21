package Characters;



public class Pícaro extends Personaje{

	public Pícaro(String name, String category, String weapon, String sex, int ability, int combat, int clever, int health) {
		super(name, category, weapon, sex, ability+2, combat, clever, health);
		
	}

}
