package nl.pluralsight.stagepass.exception;

public class ConcertNotFoundException extends RuntimeException {
    public ConcertNotFoundException(String message) {
        super(message);
    }
}
