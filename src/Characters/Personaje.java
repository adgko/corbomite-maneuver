/**
 * 
 */
package Characters;
import javax.swing.JTextField;

import Combat.BowBehavior;
import Combat.CombatBehavior;
import Combat.StaffBehavior;
import Combat.SwordBehavior;

/**
 * @author Diego
 *
 */
public abstract class Personaje {				//BUSCAR BASE DE DATOS DE NOMBRES

	
	protected String nombre;					//nombre que va a tener el personaje	
	protected String categoría;				    //si es jugador o npc (personaje no jugador)
	protected String arma;						//el arma que se le asignará al jugador
	protected String sexo;						//si es hombre o mujer
	protected int 	 habilidad;					//valor utilizado para proezas como cabalgar, abrir cerraduras, etc
	protected int	 pelea;						//valor utilizado para combate
	protected int	 astucia;					//valor utilizado para decifrar enigmas, convencer gente, etc
	protected int	 salud;						//puntos de vida que tiene el personaje, cuando llegan a 0, el personaje está muerto
	protected String bio;						//donde el jugador puede agregar historia de su personaje
	CombatBehavior combatBehavior;
	public Personaje(String name, String category, String weapon, String sex, int ability, int combat, int clever, int health ) {						//pasar todos los datos al constructor y de ahí sacar
		
		this.nombre=name;
		this.sexo=sex;
		this.categoría=category;
		this.arma=weapon;
		this.habilidad=ability;
		this.pelea=combat;
		this.astucia=clever;
		this.salud=health;
		//this.bio=oib;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}

	public int getPelea() {
		return pelea;
	}

	public void setPelea(int pelea) {
		this.pelea = pelea;
	}

	public int getAstucia() {
		return astucia;
	}

	public void setAstucia(int astucia) {
		this.astucia = astucia;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	
	
	public CombatBehavior getCombatBehavior() {
		return combatBehavior;
	}

	public void setCombatBehavior(String arma) {
		//this.combatBehavior = combatBehavior;
		switch(arma) {// "Arco", "Cétro", "Maza", "Látigo", "Daga"
		case "Espada": combatBehavior = new SwordBehavior();
		break;
		
		case "Arco": combatBehavior = new BowBehavior();
		break;
		
		case "Cétro": combatBehavior = new StaffBehavior();
		break;
		}
		
	}


		
	public void hacerAtaque(int pelea, JTextField jtextfield) {
		 combatBehavior.fight(pelea,jtextfield);
		}
	
	}


