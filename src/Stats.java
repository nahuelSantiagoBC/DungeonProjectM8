public class Stats extends Item {
    // Atributos
    private int hp;
    private int damage;
    private int defense;

    // Constructores
    public Stats(String name, String type, int hp, int damage, int defense) {
        super(name, type);
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }

    public Stats(int hp, int damage, int defense) {
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }

    // Métodos
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
