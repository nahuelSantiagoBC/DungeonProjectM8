public class Character {

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
	 * Get the Character's Name
	 * @return Character's Name
	 */
	
	private String getName() {
		return this.name;
	}
	
	/**
	 * Modify the Character's Name
	 * @param name
	 */
	
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the Character's Max HP
	 * @return Character's Max HP
	 */
	private int getMaxHp() {
		return this.maxHp;
	}
	
	/**
	 * Modify the Character's Max HP
	 * @param maxHp
	 */
	
	private void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	/**
	 * Get the Character's HP
	 * @return Character's HP
	 */
	private int getHp() {
		return this.hp;
	}
	
	/**
	 * Modify the Character's HP
	 * @param hp
	 */
	private void setHp(int hp) {
		this.hp = hp;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	/**
	 * Get the Character's Attack
	 * @return Character's Attack
	 */
	private int getAttack() {
		return this.attack;
	}
	
	/**
	 * Modify the Character's Attack
	 * @param attack
	 */
	private void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Get the Character's Defense
	 * @return Character's Defense
	 */
	private int getDefense() {
		return this.defense;
	}
	
	/**
	 * Modify the Character's Defense
	 * @param defense
	 */
	private void setDefense(int defense) {
		this.defense = defense;
	}
	
	/**
	 * Get the Character's Extra Defense Value
	 * @return Character's Extra Defense
	 */
	public int getExtraDefense() {
		return extraDefense;
	}
	
	/**
	 * Modify the Character's Extra Defense Value
	 * @param extraDefense
	 */
	public void setExtraDefense(int extraDefense) {
		this.extraDefense = extraDefense;
	}
	
	private boolean isDefending() {
		return defending;
	}
	private void setDefending(boolean defending) {
		this.defending = defending;
	}
	public Item getInventory() {
		return inventory;
	}
	private void setInventory(Item inventory) {
		this.inventory = inventory;
	}
	private boolean isUseItems() {
		return useItems;
	}
	private void setUseItems(boolean useItems) {
		this.useItems = useItems;
	}
	
}

