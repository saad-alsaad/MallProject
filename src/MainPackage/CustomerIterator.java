package MainPackage;

import java.util.List;

public class CustomerIterator extends ObjectIterator{

    public CustomerIterator(List objects) {
        super(objects);
    }

    @Override
    public Customer next() {
        return (Customer) objects.get(index++);
    }
}
