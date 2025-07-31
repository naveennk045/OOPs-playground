package exceptions;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials() {
        super("Invalid credentials");
    }
}
