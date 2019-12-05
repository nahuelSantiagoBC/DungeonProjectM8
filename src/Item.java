public class Item {
    // Atributos
    private String name;
    private String type;

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
}
