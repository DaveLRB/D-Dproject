import java.util.LinkedList;

public class Inventory {
    private LinkedList<Item> itemList;
    public Inventory() {
        itemList = new LinkedList<>();
    }
    public LinkedList<Item> getItemList() {
        return itemList;
    }
}
