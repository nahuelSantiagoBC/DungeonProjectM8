
public class Warrior extends Hero {

	/**
	 * Crea un Guerrero sin parametros, generados aleatoriamente
	 */
	public Warrior() {
		super();
		this.attack *= 1.2;
		this.defense *= 1.1;
	}

	/**
	 * Crea un Guerrero pasandole por parámetros sus atributos.
	 * @param name
	 * @param hp
	 * @param attack
	 * @param defense
	 */
	public Warrior(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		this.attack *= 1.2;
		this.defense *= 1.1;
		
	}

	
}
