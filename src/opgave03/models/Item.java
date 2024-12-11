package opgave03.models;

public class Item implements Comparable<Item> {
    private String description;
    private int price;

    public Item(String description, int price) {
        this.price = price;
        this.description = description;
    }

    @Override
    public int compareTo(Item o) {
        return 0;
    }

    @Override
    public String toString() {
        return description + " pris: " + price;
    }
}
