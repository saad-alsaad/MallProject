package MainPackage;

import java.util.ArrayList;

public class Customer implements Observer{
    public ShoppingCart shoppingCart;
    public String name;
    public Store store;

    public Customer(String name, Store store) {
        this.shoppingCart = new ShoppingCart();
        this.name = name;
        this.store = store;
    }

    void checkItem(ArrayList<Item> items){
        for(int counter = 0; counter < items.size(); counter++ ){
            Item item = items.get(counter);
            System.out.println("Item Name: " + item.name + "\nItem Price: " + item.price + "\nStoreId: " + item.storeId);
        }
    }
    @Override
    public void update(Object o) {
        if(o instanceof Store){
            Store obj = (Store) o;
            checkItem(obj.getState());
        }
    }
}
