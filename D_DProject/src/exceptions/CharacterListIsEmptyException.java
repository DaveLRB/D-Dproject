package exceptions;

public class CharacterListIsEmptyException extends RuntimeException {

    public CharacterListIsEmptyException(String message) {
        super(message);
    }

    public CharacterListIsEmptyException() {
        super("The list is empty.");
    }
}
