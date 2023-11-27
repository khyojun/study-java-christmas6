package christmas.exception;

public class DateException extends IllegalArgumentException{

    public DateException() {

    }

    public DateException(String message) {
        super(message);
    }

}
