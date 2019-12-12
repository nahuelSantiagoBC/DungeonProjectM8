public abstract class Character {

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
	}
	public Character () {
		this.name = null;
		this.maxHp = 0;
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
	}
	
	//m�todos
	
	/**
	 * Atacar a un altre personatge, ja sigui heroi i monstre.<br>
	 * <b>Si el personatge objectiu s'est� defensant, aquest obt� m�s defensa basat en la seva defensa extra.</b> 
	 * @param target
	 */
	public void attack(Character target) {
		int damage = getAttack() * (100 / (100 + target.getDefense() + target.getExtraDefense()));
		
		if (damage > 0) {
			target.setHp(target.getHp() - damage);
			
		}
	}
	
	/**
	 * Defensarse. Aquesta acci� fixa el teu estat a defensa.<br>
	 * Al ser atacat rebr� menys Damage.
	 */
	public void defend() {
		this.defending = true;
	}
	
	/**
	 * El personaje muere
	 */
	public abstract void die();
	
	
	//getters & setters
	
	/**
	 * Obtener el nombre del personaje
	 * @return Character's Name
	 */
	
	private String getName() {
		return this.name;
	}
	
	/**
	 * Modificar el nombre del personaje
	 * @param name
	 */
	
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Obtener la vida del personaje maxima
	 * @return Character's Max HP
	 */
	private int getMaxHp() {
		return this.maxHp;
	}
	
	/**
	 * Modificar la vida del personaje maxima
	 * @param maxHp
	 */
	
	private void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	/**
	 * Obtener la vida del personaje
	 * @return Character's HP
	 */
	private int getHp() {
		return this.hp;
	}
	
	/**
	 * Modificar la vida del personaje y comprobar si es 0.
	 * @param hp
	 */
	private void setHp(int hp) {
		this.hp = hp;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	/**
	 * Obtener el ataque del personaje
	 * @return Character's Attack
	 */
	private int getAttack() {
		return this.attack;
	}
	
	/**
	 * Modificar el ataque del personaje
	 * @param attack
	 */
	private void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Obtener la defensa del personaje
	 * @return Character's Defense
	 */
	private int getDefense() {
		return this.defense;
	}
	
	/**
	 * Modificar la defensa del personaje
	 * @param defense
	 */
	private void setDefense(int defense) {
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
	private boolean isDefending() {
		return defending;
	}
	/**
	 * Modificar si el personaje de esta defendiendo
	 * @param defending
	 */
	private void setDefending(boolean defending) {
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
	private void setInventory(Item inventory) {
		this.inventory = inventory;
	}
	/**
	 * Ver si el personaje puede usar objetos
	 * @return
	 */
	private boolean isUseItems() {
		return useItems;
	}
	/**
	 * Modificar si el peronaje puede usar objetos
	 * @param useItems
	 */
	private void setUseItems(boolean useItems) {
		this.useItems = useItems;
	}
	
}

