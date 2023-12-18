package exceptions;

public class UnableToEquipAnUnknownItem extends RuntimeException {
    public UnableToEquipAnUnknownItem() {
        super("Unable to equip this item.");
    }
}
