package exceptions;

public class UnableToEquipAnUnknownItem extends RuntimeException {
    public UnableToEquipAnUnknownItem() {
        super("This inventory slot is empty.");
    }
}
