package exceptions;

public class InvalidTypeOfCharacterException extends RuntimeException{
    public InvalidTypeOfCharacterException(String message) {
        super(message);
    }

    public InvalidTypeOfCharacterException() {
        super("Invalid type of character.");
    }
}
