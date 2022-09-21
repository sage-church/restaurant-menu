package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<String> menuItems = new ArrayList<>();

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    void setLastUpdated(Date date) {
        this.lastUpdated = date;
    }

    void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem.getName());
    }

}
