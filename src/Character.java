import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public abstract class Character {

	protected static final int MAX_HP_LIMIT = 500;
	protected static final int MAX_HP_MINIMUM = 300;
	protected static final int ATTACK_LIMIT = 50;
	protected static final int ATTACK_MINIMUM = 20;
	protected static final int DEFENSE_LIMIT = 10;
	protected static final int DEFENSE_MINIMUM = 0;
	protected static final String RANDOM_NAMES[] = {
			"Jonnhy",
			"Chuck Norris",
			"Lizardo",
			"Fénix",
			"Darth Vader",
			"Salmón",
			"El tío Pepe",
			"Aragorn",
			"Shrek",
			"Uganda Knuckles"
	};
	
	//atributos
	protected String name;
	protected int maxHp;
	protected int hp;
	protected int attack;
	protected int defense;
	protected int extraDefense;
	protected boolean defending = false;
	private Item inventory;
	//boleana para controlar si el personaje utiliza los objetos o no
	private boolean useItems;
	
	public Character (String name, int hp, int attack, int defense) {
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.inventory = null;
	}
	/**
	 * @TODO: Parametres aleatoris
	 */
	public Character () {
		Random randomGenerator = new Random();
		this.name = RANDOM_NAMES[randomGenerator.nextInt((RANDOM_NAMES.length) + 1)];
		this.maxHp = randomGenerator.nextInt((MAX_HP_LIMIT - MAX_HP_MINIMUM) + 1) + MAX_HP_MINIMUM;
		this.hp = maxHp;
		this.attack = randomGenerator.nextInt((ATTACK_LIMIT - ATTACK_MINIMUM) + 1) + ATTACK_MINIMUM;
		this.defense = randomGenerator.nextInt((DEFENSE_LIMIT - DEFENSE_MINIMUM) + 1) + DEFENSE_MINIMUM;
		this.inventory = null;
	}
	
	//métodos
	
	/**
	 * Atacar a un altre personatge, ja sigui heroi i monstre.<br>
	 * <b>Si el personatge objectiu s'està defensant, aquest obté més defensa basat en la seva defensa extra.</b> 
	 * @param target
	 */
	public void attack(Character target) {
		int damage = getAttack() * (100 / (100 + target.getDefense() + target.getExtraDefense()));
		
		if (damage > 0) {
			target.setHp(target.getHp() - damage);
			
		}
	}
	
	/**
	 * Defensarse. Aquesta acció fixa el teu estat a defensa.<br>
	 * Al ser atacat rebrà menys Damage.
	 */
	public void defend() {
		this.defending = true;
	}
	
	//getters & setters
	
	/**
	 * Obtener el nombre del personaje
	 * @return Character's Name
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Modificar el nombre del personaje
	 * @param name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Obtener la vida del personaje maxima
	 * @return Character's Max HP
	 */
	public int getMaxHp() {
		return this.maxHp;
	}
	
	/**
	 * Modificar la vida del personaje maxima
	 * @param maxHp
	 */
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	/**
	 * Obtener la vida del personaje
	 * @return Character's HP
	 */
	public int getHp() {
		return this.hp;
	}
	
	/**
	 * Modificar la vida del personaje y comprobar si es 0.
	 * @param hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
		if (this.hp <= 0) {
			this.die(this);
		}
	}

	protected abstract void die(Character character);

	/**
	 * Obtener el ataque del personaje
	 * @return Character's Attack
	 */
	public int getAttack() {
		return this.attack;
	}
	
	/**
	 * Modificar el ataque del personaje
	 * @param attack
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Obtener la defensa del personaje
	 * @return Character's Defense
	 */
	public int getDefense() {
		return this.defense;
	}
	
	/**
	 * Modificar la defensa del personaje
	 * @param defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	/**
	 * Obtener el valor de defensa extra del personaje
	 * @return Character's Extra Defense
	 */
	public int getExtraDefense() {
		return extraDefense;
	}
	
	/**
	 * Modificar el valor de defensa extra del personaje
	 * @param extraDefense
	 */
	public void setExtraDefense(int extraDefense) {
		this.extraDefense = extraDefense;
	}
	
	/**
	 * Ver si el personaje se esta defendiendo
	 * @return
	 */
	public boolean isDefending() {
		return defending;
	}
	/**
	 * Modificar si el personaje de esta defendiendo
	 * @param defending
	 */
	public void setDefending(boolean defending) {
		this.defending = defending;
	}
	/**
	 * Obtener el inventario del personaje
	 * @return
	 */
	public Item getInventory() {
		return inventory;
	}
	/**
	 * Asignar un inventario al personaje
	 * @param inventory
	 */
	public void setInventory(Item inventory) {
		this.inventory = inventory;
	}
	/**
	 * Ver si el personaje puede usar objetos
	 * @return
	 */
	public boolean isItemUser() {
		return useItems;
	}
	/**
	 * Modificar si el peronaje puede usar objetos
	 * @param useItems
	 */
	public void setUseItems(boolean useItems) {
		this.useItems = useItems;
	}
	// Esto no hará nada en monstruos
	protected abstract void searchItems(Monster monster);
	
}

