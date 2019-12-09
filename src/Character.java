public class Character {

	//atributos
	protected static int timesCreated = 0;
	protected int id;
	protected String name;
	protected int maxHp;
	protected int hp;
	protected int attack;
	protected int defense;
	protected boolean defending;
	protected int extraDefense;
	
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
	 * Get the Character's ID
	 * @return Character's ID
	 */
	
	private int getId() {
		return this.id;
	}
	/**
	 * Modify the Character's ID
	 * @param id
	 */
	
	private void setId(int id) {
		this.id = id;
	}
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
	
}

