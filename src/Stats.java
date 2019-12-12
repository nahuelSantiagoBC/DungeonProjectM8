public class Stats extends Item {
    // Atributos
    private int hp;
    private int damage;
    private int armor;

    // Constructores
    public Stats(String name, String type, int hp, int damage, int armor) {
        super(name, type); //???
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    public Stats(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
