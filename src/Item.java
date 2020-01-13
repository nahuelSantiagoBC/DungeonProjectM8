import java.util.Random;

public class Item {
	
	protected static final int HP_LIMIT = 200;
	protected static final int HP_MINIMUM = 0;
	protected static final int ATTACK_LIMIT = 50;
	protected static final int ATTACK_MINIMUM = 0;
	protected static final int ARMOR_LIMIT = 100;
	protected static final int ARMOR_MINIMUM = 0;
	protected static final int MANA_LIMIT = 100;
	protected static final int MANA_MINIMUM = 0;
	protected static final String RANDOM_ITEMS[][] = {
			{"Tuntankamon's Hammer", "Weapon", "The mighty hammer of the famous Tuntankamon"},
			{"Chuck Norris's razor blade", "Weapon", "What can be stronger than the razor blade used by the strongest living being?"},
			{"Reptilian Skin", "Armor", "With this skin the bearer will gain more resistance and slimyness"},
			{"Fireman suit", "Armor", "It was supposed to help ressist something from another world, but in this one, it will protect the bearer from anything instead"},
			{"Lightsaber", "Weapon", "May you be with lots of force"},
			{"Fishing rod", "Weapon", "Perfect at kicking fish ass"},
			{"Inifinity Gauntlet", "Weapon", "For the love of God, don't try to snap. It's useless, Iron is not like flesh! Just don't..."},
			{"Master Sword", "Weapon", "Ey! Listen! It's dangerous out there. Take this with you."},
			{"Strength potion", "Equipment", "It smells like Fairy. But washing the dishes with it doesn't seem to work."},
			{"The Stick", "Weapon", "Un palo!!!! Es un PAAAALOOOO!!"}
	};
    // Atributos
    private String name;
    private String type;
    private String description;
    private int hp;
	private int attack;
    private int armor;
    private int mana;

    // Constructores
    public Item(String name, String type, String description, int hp, int attack, int armor, int mana) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.mana = mana;
    }

    public Item() {
    	Random randomGenerator = new Random();
    	int randomItemId = randomGenerator.nextInt((RANDOM_ITEMS.length - 1) + 1);
		this.name = RANDOM_ITEMS[randomItemId][0];
		this.description = RANDOM_ITEMS[randomItemId][1];
		this.description = RANDOM_ITEMS[randomItemId][2];
		this.hp = randomGenerator.nextInt((HP_LIMIT - HP_MINIMUM) + 1) + HP_MINIMUM;
		this.attack = randomGenerator.nextInt((ATTACK_LIMIT - ATTACK_MINIMUM) + 1) + ATTACK_MINIMUM;
		this.armor = randomGenerator.nextInt((ARMOR_LIMIT - ARMOR_MINIMUM) + 1) + ARMOR_MINIMUM;
		this.mana = randomGenerator.nextInt((MANA_LIMIT - MANA_MINIMUM) + 1) + MANA_MINIMUM;
    }

    // Metodos
    /**
     * Obtiene el nombre del objeto
     * @return nombre del objeto
     */
    public String getName() {
        return name;
    }

    /**
     * Cambia el nombre del objeto
     * @param nombre del objeto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el tipo de objeto
     * @return tipo de objeto
     */
    public String getType() {
        return type;
    }
    
    /**
     * Cambia el tipo del objeto
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Obtiene la HP que otorga el objeto
     * @return HP que otorga el objeto
     */
    public int getHp() {
		return hp;
	}

    /**
     * Cambia el HP que otorga el objeto
     * @param HP que otorga el objeto
     */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Obtiene el ATK que otorga el objeto
	 * @return ATK que otorga el objeto
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * Cambia el ATK que otorga el objeto
	 * @param ATK que otorga el objeto
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * Obtiene el DEF que otorga el objeto
	 * @return DEF que otorga el objeto
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * Cambia el DEF que otorga el objeto
	 * @param DEF que otorga el objeto
	 */
	public void setArmor(int armor) {
		this.armor = armor;
	}

	/**
	 * Obtiene el mana que otorga el objeto
	 * @return mana que otorga el objeto
	 */
	public int getMana() {
		return mana;
	}
	
	/**
	 * Cambia el mana que otorga el objeto
	 * @param mana que otorga el objeto
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	/**
	 * Obtiene la descipción del objeto
	 * @return descipción del objeto
	 */
    public String getDescription() {
		return description;
	}

    /**
     * Cambia la descripción del objeto
     * @param descipción del objeto
     */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Obtiene la información del objeto.
	 */
	public String toString() {
		String returnString = "Object Name: " + this.getName() + "\nDescription: " + this.getDescription();
		returnString += "Stats:\nAttack: " + this.getAttack();
		returnString += "\nArmor: " + this.getArmor();
		returnString += "\nHP: " + this.getHp();
		if (this.getMana() != 0) {
			returnString += "\nMana: " + this.getMana();
		}
    	return returnString;
    }
}
