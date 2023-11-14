package christmas;

public class Menu {
    private String name;
    private String category;
    private int price;

    public Menu(String name, String category, int price) {
        this.name = name;
        this.category=category;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
