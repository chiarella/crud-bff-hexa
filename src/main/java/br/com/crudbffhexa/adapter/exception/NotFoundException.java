package br.com.crudbffhexa.adapter.exception;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = -3355831983510373983L;
	public NotFoundException(String message) {
		super(message);
	}
}
