package MainPackage;

import java.util.ArrayList;

public class BookStore extends Store {

    static int id = 3;
    public BookStore(String name) {
        this.name = name;
    }

    @Override
    void enter(Customer c) {
        this.customers.add(c);
    }

    @Override
    void exit(Customer c) {
        this.customers.remove(c);
    }
}
