package exceptions;

public class AlreadyEquipedException extends RuntimeException {
    public AlreadyEquipedException() {
        super("Already have a equiped weapon. Please unquip the already equiped weapon first to equip this weapon.");
    }
}
