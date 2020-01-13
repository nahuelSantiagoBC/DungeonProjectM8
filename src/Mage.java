import java.util.Random;

public class Mage extends Hero {
	
	protected static final int MAX_MP_LIMIT = 150;
	protected static final int MAX_MP_MINIMUM = 50;

	
	private int mp;
	private int maxMP;
	private String spellName = "Fireball";
	private String spellDescription = "Creates a ball of fire that deals damage";
	
	/**
	 * Crea un nuevo mago sin parámetros, generados aleatoriamente
	 */
	public Mage() {
		super();
		Random randomGenerator = new Random();
		this.mp = randomGenerator.nextInt((MAX_MP_LIMIT - MAX_MP_MINIMUM) + 1) + MAX_MP_MINIMUM;
		this.maxMP = mp;
	}
	/**
	 * Crea un nuevo mago pasando por parámetro sus características.
	 * @param name
	 * @param hp
	 * @param attack
	 * @param defense
	 * @param mp
	 */
	public Mage(String name, int hp, int attack, int defense, int mp) {
		super(name, hp, attack, defense);
		this.mp = mp;
		this.maxMP = mp;
	}
	
	/**
	 * Obtiene el MP actual
	 * @return
	 */
	public int getMP() {
		return mp;
	}
	/**
	 * Cambia el MP actual
	 * @param mp
	 */
	public void setMP(int mp) {
		this.mp = mp;
	}
	
	/**
	 * Obtiene el MP maximo
	 * @return
	 */
	public int getMaxMP() {
		return maxMP;
	}
	/**
	 * Cambia el MP maximo
	 * @param maxMP
	 */
	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
	}
	/**
	 * Obtiene el nombre del Hechizo asignado
	 * @return
	 */
	public String getSpellName() {
		return spellName;
	}
	/**
	 * Cambia el nombre del hechizo asignado
	 * @param spellName
	 */
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}
	/**
	 * Obtiene la descripción del Hechizo
	 * @return
	 */
	public String getSpellDescription() {
		return spellDescription;
	}
	/**
	 * Cambia la descripcion del Hechizo
	 * @param spellDescription
	 */
	public void setSpellDescription(String spellDescription) {
		this.spellDescription = spellDescription;
	}
	/**
	 * Utilitza la bola de foc
	 * @param target
	 */
	public void useSpell(Character target) {
		target.setHp(target.getHp() - 100);
	}

	
	
}
