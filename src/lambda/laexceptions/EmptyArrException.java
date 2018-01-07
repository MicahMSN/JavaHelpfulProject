package lambda.laexceptions;

public class EmptyArrException extends Exception {
    public EmptyArrException() {
        super("Array is empty.");
    }
}
