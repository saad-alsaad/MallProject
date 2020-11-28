package MainPackage;

import java.util.ArrayList;
import java.util.List;

abstract class Store implements Subject{      //factory method
    String name;
    int id;
    ArrayList<Item> items = new ArrayList<Item>();;
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Observer> observers;
    ArrayList<Store> stores;

    void Store(){
        observers = new ArrayList<Observer>();
        stores = new ArrayList<Store>();
    }

    public ArrayList<Item> getState(){
        return items;
    }
    abstract void enter(Customer c);

    abstract void exit(Customer c);

    CustomerIterator customers(){
        return (new CustomerIterator(customers));
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void sendNotification(){
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).update(this);
        }
    }

    public void addItem(String itemName, double itemPrice){
        items.add(new Item(itemName,id,itemPrice));
    }

    ItemIterator items(){
        return (new ItemIterator(items));
    }

    public void addStore(Store store){
        stores.add(store);
    }
}
