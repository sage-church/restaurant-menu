package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;

    public static void main(String[] args) {

        ArrayList<String> menuItemCategories = new ArrayList<>();

        menuItemCategories.add("appetizer");
        menuItemCategories.add("main course");
        menuItemCategories.add("dessert");

    }

    public MenuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public double getPrice() {
        return this.price;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setCategory(String category) {
        this.category = category;
    }

    void setPrice(double price) {
        this.price = price;
    }

}
