
public class Monster {
	private String name;
	private int hp;
	private int ataque;
	private int defense;
	public String getNom() {
		return name;
	}
	public void setNom(String nom) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defense;
	}
	public void setDefensa(int defensa) {
		this.defense = defensa;
	}

	public Monster (String nom, int hp, int ataque, int defensa) {
		this.name = nom;
		this.hp = hp;
		this.ataque = ataque;
		this.defense = defensa;
	}
	public Monster () {
		this.name = null;
		this.hp = 0;
		this.ataque = 0;
		this.defense = 0;
	}
}
