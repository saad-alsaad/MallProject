package MainPackage;

import java.util.List;

public class StoreIterator extends ObjectIterator {
    public StoreIterator(List objects) {
        super(objects);
    }

    @Override
    public Store next() {
        return (Store) objects.get(index++);
    }
}
