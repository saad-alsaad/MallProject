package MainPackage;

import java.util.ArrayList;

public class GameStore extends Store {

    static int id = 1;
    String name;

    public GameStore(String name) {
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
