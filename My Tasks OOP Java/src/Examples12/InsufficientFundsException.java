package Examples12;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
