public class Item {
    // Atributos
    private String name;
    private String type;
    private String description;
    private int hp;
	private int attack;
    private int armor;
    private int mana;

    // Constructores
    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Item() {
    	
    }

    // MÃ©todos
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
