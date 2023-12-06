package exceptions;

public class OperationCancelledException extends RuntimeException {
    public OperationCancelledException(){
        super("\nLeaving dungeon\n");
    }
}
