package br.com.crudbffhexa.adapter.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

	private static final String ERROR = "error";
	
	/*
	 * Exception para caracter no local de numero
	 */
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException e) {
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(createErrorResponse(e.getMessage(), ExceptionType.errorCodeFromException(e)));
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> handleNotFound2Exception(NotFoundException e) {
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(createErrorResponse(e.getMessage(), 
						ExceptionType.errorCodeFromException(e)));
	}
	
	
	private Map<String, Object> createErrorResponse(String message, ErrorCode errorCode) {
		Map<String, Object> errorDetails = new HashMap<>();
		errorDetails.put("timestamp", LocalDateTime.now().toString());
		errorDetails.put("status", errorCode.getCode());
		errorDetails.put(ERROR, errorCode.getMessage());
		errorDetails.put("message", message);
		return errorDetails;
	}

}
