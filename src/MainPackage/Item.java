package MainPackage;

class Item {
    String name;
    int id;
    int storeId;
    double price;

    public Item(String name, int storeId, double price) {
        this.name = name;
        this.storeId = storeId;
        this.price = price;
    }
}
