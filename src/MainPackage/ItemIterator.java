package MainPackage;

import java.util.List;

public class ItemIterator extends ObjectIterator{

    public ItemIterator(List objects) {
        super(objects);
    }

    @Override
    public Item next() {
        return (Item) objects.get(index++);
    }
}
