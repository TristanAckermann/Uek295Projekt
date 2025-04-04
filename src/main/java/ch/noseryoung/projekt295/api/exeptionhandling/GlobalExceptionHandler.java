package ch.noseryoung.projekt295.api.exeptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

  /**
   * Handler für IllegalArgumentException und IllegalStateException
   */
  @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
  public ResponseEntity<Object> handleBadRequest(RuntimeException ex) {
    return buildResponseEntity(HttpStatus.BAD_REQUEST, ex.getMessage());
  }

  /**
   * Handler für RetailStoreNotFoundException
   */
  @ExceptionHandler(value = { RetailStoreNotFoundException.class })
  public ResponseEntity<Object> handleNotFound(RetailStoreNotFoundException ex) {
    return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
  }

  /**
   * Allgemeiner Handler für unerwartete Fehler
   */
  @ExceptionHandler(value = { Exception.class })
  public ResponseEntity<Object> handleGenericException(Exception ex) {
    return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, "Ein unerwarteter Fehler ist aufgetreten");
  }

  /**
   * Handler für ReviewNotFoundException
   */
  @ExceptionHandler(value = { ReviewNotFoundException.class })
  public ResponseEntity<Object> handleReviewNotFound(ReviewNotFoundException ex) {
    return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
  }

  /**
   * Hilfsmethode zur Erstellung der ResponseEntity für alle Exceptions
   */
  private ResponseEntity<Object> buildResponseEntity(HttpStatus status, String message) {
    ApiError apiError = new ApiError(
            status,
            message,
            LocalDateTime.now()
    );
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }
}
