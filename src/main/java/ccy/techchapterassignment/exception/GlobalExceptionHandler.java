package ccy.techchapterassignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TalentNotFound.class)
    public ResponseEntity<Error> handleTalentNotFound(TalentNotFound exception) {
        Error error = new Error(404, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(DocumentNotFound.class)
    public ResponseEntity<Error> handleDocumentNotFound(DocumentNotFound exception) {
        Error error = new Error(404, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
