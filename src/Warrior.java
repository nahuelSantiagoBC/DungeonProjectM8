
public class Warrior extends Hero {

	public Warrior() {
		super();
	}

	public Warrior(String name, int hp, int attack, int defense) {
		super(name, hp, attack, defense);
		this.attack *= 1.2;
		this.defense *= 1.1;
		
	}

	
}
