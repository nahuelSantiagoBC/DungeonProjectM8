
public class Monster extends Character {
	
	public Monster (String name, int hp, int attack, int defense, int extraDefense) {
		timesCreated++;
		this.id = timesCreated;
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.defending = false;
		this.extraDefense = extraDefense;
	}
	public Monster () {
		timesCreated++;
		this.id = timesCreated;
		this.name = null;
		this.maxHp = 0;
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
		this.defending = false;
		this.extraDefense = 0;
	}
	
}
