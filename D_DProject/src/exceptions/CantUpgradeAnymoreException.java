package exceptions;

public class CantUpgradeAnymoreException extends RuntimeException {
    public CantUpgradeAnymoreException() {
        super("Can't upgrade anymore.");
    }
}
