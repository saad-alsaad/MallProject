package MainPackage;

public class ShoeStore extends Store {

    static int id = 2;
    public ShoeStore(String name) {
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
