public class Character {

	//atributos
	private int id;
	private String name;
	private int maxHp;
	private int hp;
	private int attack;
	private int defense;
	private boolean defending;
	
	//métodos
	
	//atacar (por ahora, solo a héroes)
	public void attack(Character target) {
		int damage = getAttack() * (100 / (100 + target.getDefense() + target.extraDefense()));
		
		if (damage > 0) {
			target.setHp(target.getHp() - damage);
		}
	}
	
	public void defend() {
		defending = true;
	}
	
	private int extraDefense() {
		
		int extraDefense = 0;
		
		if (defending) {
			extraDefense = 40;
			defending = false;
		}
		
		return extraDefense;
	}
	
	//getters & setters
	
	private int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	private String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private int getMaxHp() {
		return maxHp;
	}
	
	private void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	private int getHp() {
		return hp;
	}
	
	private void setHp(int hp) {
		this.hp = hp;
	}
	
	private int getAttack() {
		return attack;
	}
	
	private void setAttack(int attack) {
		this.attack = attack;
	}
	
	private int getDefense() {
		return defense;
	}
	
	private void setDefense(int defense) {
		this.defense = defense;
	}
	
}

