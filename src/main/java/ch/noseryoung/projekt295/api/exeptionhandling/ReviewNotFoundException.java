package ch.noseryoung.projekt295.api.exeptionhandling;


public class ReviewNotFoundException extends RuntimeException {
    public ReviewNotFoundException(String message) {
        super(message);
    }
}
