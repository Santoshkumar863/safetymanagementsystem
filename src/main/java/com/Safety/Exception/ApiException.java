package com.Safety.Exception;

public class ApiException extends RuntimeException{
	private static final long serialVersionsUID=1l;
	public ApiException(String message) {
		super(message);
	}

}
