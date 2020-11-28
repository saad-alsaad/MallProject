package MainPackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        Mall mall = Mall.getInstance("Mall1");    // ONLY one instance
        BookStore bookStore = new BookStore("bookStore1");
        ShoeStore shoeStore = new ShoeStore("shoeStore1");
        GameStore gameStore = new GameStore("gameStore1");

        mall.addStore(bookStore);
        mall.addStore(shoeStore);
        mall.addStore(gameStore);

        bookStore.addItem("Item1",39.9);
        bookStore.addItem("Item2",38.3);
        ItemIterator bookStoreItems = bookStore.items();
        while(bookStoreItems.hasNext()) {
            Item obj = bookStoreItems.next();
            System.out.println("Item Name: " + obj.name +"\nItem Price: " + obj.price);
        }

        Customer customer = new Customer("Ahmed", bookStore);
        bookStore.enter(customer);

        // Reading Customers from bookStore
        CustomerIterator customers = bookStore.customers();
        while(customers.hasNext()) {
            Customer obj = customers.next();
            System.out.println("Customer Name: " + obj.name +"\nThe Store that he/she is in " + obj.store.name);
        }

        // Reading
        CustomerIterator customersMall = mall.customers();
        while(customersMall.hasNext()) {
            Customer obj = customersMall.next();
            System.out.println("Customer Name: " + obj.name +"\nThe Store that he/she is in " + obj.store.name);
        }
    }
}
