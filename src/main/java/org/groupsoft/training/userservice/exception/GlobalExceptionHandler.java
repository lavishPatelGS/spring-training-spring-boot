package org.groupsoft.training.userservice.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String> handleSQLException(SQLException ex) {
		// Log the exception and return an appropriate response
		return new ResponseEntity<>("Database error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
