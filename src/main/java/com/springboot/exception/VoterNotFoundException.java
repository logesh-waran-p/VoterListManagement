package com.springboot.exception;

public class VoterNotFoundException extends RuntimeException {

	
	 public VoterNotFoundException(String message) {
	        super(message);
	    }
}
