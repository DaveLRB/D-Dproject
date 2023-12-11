package exceptions;

public class NothingEquipedException extends RuntimeException {
    public NothingEquipedException() {
        super("Please equip something first to use this feature.");
    }
}
