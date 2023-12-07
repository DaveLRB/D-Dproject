package exceptions;

public class NotEnoughFundsToUpgradeException extends RuntimeException {
    public NotEnoughFundsToUpgradeException() {
        super("Not enough funds to upgrade this item.");
    }

    public NotEnoughFundsToUpgradeException(String message) {
        super(message);
    }
}
