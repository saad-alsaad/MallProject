package MainPackage;

import java.util.List;

abstract class ObjectIterator {
    List objects;
    int index = 0;

    public ObjectIterator(List objects) {
        this.objects = objects;
    }

    //@Override
    public boolean hasNext() {
        if (index >= objects.size()
                || objects.get(index) == null){
            return false;
        }
        return true;
    }

    //@Override
    abstract public Object next();
}
