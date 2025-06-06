package exceptions;

public class DogNotFoundException extends Exception {

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }

    public DogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DogNotFoundException(Throwable cause) {
        super(cause);
    }

    public DogNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
