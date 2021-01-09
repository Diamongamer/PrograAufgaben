public class UnknownKeyException extends Exception {
    public UnknownKeyException() {
        super();
    }

    public UnknownKeyException(String message) {
        super(message);
    }

    public UnknownKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownKeyException(Throwable cause) {
        super(cause);
    }

    protected UnknownKeyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
