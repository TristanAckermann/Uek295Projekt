package ch.noseryoung.projekt295.api.exeptionhandling;


public class RetailStoreNotFoundException extends RuntimeException {
    public RetailStoreNotFoundException(String message) {
        super(message);
    }
}
