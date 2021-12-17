package com.devsuperior.bds02.services.exceptions;

public class NonExistentIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NonExistentIdException(String message) {
		super(message);
	}

}
