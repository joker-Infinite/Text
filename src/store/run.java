package store;

public class run {
    public static void main(String[] args) {
        storage storage = new storage();
        storage.SQ(20);
        storage.push(1);
        storage.push(2);
        storage.push(3);
        storage.push(4);
        storage.getAllStack();
        storage.popu();
        storage.popu();
        storage.getAllStack();
    }
}
