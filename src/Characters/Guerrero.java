/**
 * 
 */
package Characters;



/**
 * @author Diego
 *
 */
public class Guerrero extends Personaje {

	public Guerrero(String name, String category, String weapon, String sex, int ability, int combat, int clever, int health) {						//pasar todos los datos al constructor y de ahí sacar
		super(name, category, weapon, sex, ability, combat+2, clever, health);
		//System.out.println(habilidad);
	}

}
