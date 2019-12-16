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

    // Métodos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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
