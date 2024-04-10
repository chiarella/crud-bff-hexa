package br.com.crudbffhexa.adapter.exception;

import java.net.BindException;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;


public enum ExceptionType {
	
	ILLEGAL_ARGUMENT(IllegalArgumentException.class, ErrorCode.DATA_NOT_FOUND),
	BIND_EXCEPTION(BindException.class, ErrorCode.VALIDATION_ERROR),
	NOT_FOUND(NotFoundException.class, ErrorCode.NOT_FOUND),
	METHOD_ARGUMENT_NOT_VALID_EXCEPTION(MethodArgumentNotValidException.class, ErrorCode.VALIDATION_ERROR),
	METHOD_ARGUMENT_TYPE_MISMATCH_EXCEPTION(MethodArgumentTypeMismatchException.class, ErrorCode.BAD_REQUEST),
	HTTP_MESSAGE_NOT_READABLE_EXCEPTION(HttpMessageNotReadableException.class, ErrorCode.BAD_REQUEST);

	
	private final Class<? extends Exception> exceptionClass;
	private final ErrorCode errorCode;
	
	ExceptionType(Class<? extends Exception> exceptionClass, ErrorCode errorCode) {
		this.exceptionClass = exceptionClass;
		this.errorCode = errorCode;
	}
	
	
	public static ErrorCode errorCodeFromException(Exception exception) {
		for (ExceptionType exceptionType : ExceptionType.values()) {
			if (exceptionType.exceptionClass.isAssignableFrom(exception.getClass())) {
				return exceptionType.errorCode;
			}
		}
		return ErrorCode.INTERNAL_SERVER_ERROR;
	}

}
