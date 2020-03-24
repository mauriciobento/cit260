package exceptions;

public class AccountException extends Exception {

    /**
     *
     */
    public AccountException() {
    }

    /**
     *
     * @param message
     */
    public AccountException(String message) {
        super(message);
    }
}
