package ch.noseryoung.projekt295.api.exeptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
  public ResponseEntity<Object> handleBadRequest(RuntimeException ex) {
    ApiError apiError = new ApiError(
            HttpStatus.BAD_REQUEST,
            ex.getMessage(),
            LocalDateTime.now()
    );
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }

  @ExceptionHandler(value = { RetailStoreNotFoundException.class })
  public ResponseEntity<Object> handleNotFound(RetailStoreNotFoundException ex) {
    ApiError apiError = new ApiError(
            HttpStatus.NOT_FOUND,
            ex.getMessage(),
            LocalDateTime.now()
    );
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }

  @ExceptionHandler(value = { Exception.class })
  public ResponseEntity<Object> handleGenericException(Exception ex) {
    ApiError apiError = new ApiError(
            HttpStatus.INTERNAL_SERVER_ERROR,
            "Ein unerwarteter Fehler ist aufgetreten",
            LocalDateTime.now()
    );
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }


  @ExceptionHandler(value = { ReviewNotFoundException.class })
  public ResponseEntity<Object> handleRetailStoreNotFound(ReviewNotFoundException ex) {
    ApiError apiError = new ApiError(
            HttpStatus.NOT_FOUND,
            ex.getMessage(),
            LocalDateTime.now()
    );
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }

}
