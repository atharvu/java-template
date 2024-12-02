public class Shoe {
    private String name;
    private double price;
    private String type;

    public Shoe(String n, double p, String t) {
        this.name = n;
        this.price = p;
        this.type = t;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}