
public class Monstre {
	private String nom;
	private int hp;
	private int ataque;
	private int defensa;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public Monstre (String nom, int hp, int ataque, int defensa) {
		this.nom = nom;
		this.hp = hp;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	public Monstre () {
		this.nom = null;
		this.hp = 0;
		this.ataque = 0;
		this.defensa = 0;
	}
}
