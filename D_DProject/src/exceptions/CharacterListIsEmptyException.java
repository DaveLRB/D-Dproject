package exceptions;

public class CharacterListIsEmptyException extends RuntimeException {

    public CharacterListIsEmptyException(String message) {
        super(message);
    }
}
