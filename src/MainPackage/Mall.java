package MainPackage;

import java.util.ArrayList;
import java.util.List;

public class Mall {      //Singleton
    String name;
    private ArrayList<Store> stores;
    private ArrayList<Customer> customers;

    static Mall instsnceObj;

    private Mall(String name){
        this.name = name;
        this.stores = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public static Mall getInstance(String mallName){
        if(instsnceObj == null){
            instsnceObj = new Mall(mallName);
        }
        return instsnceObj;
    }

    public void enter(Customer c){
        this.customers.add(c);
        System.out.println("New customer entered the mall named: "+ c.name);
    }

    public void exit(Customer c){
        boolean removingResult = this.customers.remove(c);
        if (removingResult){
            System.out.println("A customer exited the mall named: " + c.name );
        }
    }

    public ShoppingCart getShoppingCart(){
        return new ShoppingCart();
    }

    public CustomerIterator customers(){
        return (new CustomerIterator(customers));    // Size method is an Iterator
    }

    public StoreIterator stores(){
        return (new StoreIterator(stores));
    }

    public void addStore(Store s){
        this.stores.add(s);
    }
}
