package exceptions;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException(String message) {
        super(message);
    }

    public CharacterNotFoundException() {
        super("Character not found.");
    }
}
