package MainPackage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ShoppingCart {
    ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    ItemIterator items(){
        return (new ItemIterator(items));
    }

    void addItem(Item item){
        this.items.add(item);
    }

    void removeItem(Item item){
        this.items.remove(item);
    }
}
