package exceptions;

public class HealthPointsGreaterThan20Exception extends RuntimeException{
    public HealthPointsGreaterThan20Exception(){
        super("\nYou can only try to use this ability if you have 20 HP or less");
    }
}
