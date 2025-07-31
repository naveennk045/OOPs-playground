package exceptions;

public class UserNotFound extends RuntimeException {

    public UserNotFound() {
        super("User not found in the system");
    }
}