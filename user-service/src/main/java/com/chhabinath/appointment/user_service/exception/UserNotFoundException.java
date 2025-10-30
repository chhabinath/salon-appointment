package com.chhabinath.appointment.user_service.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super("User not found with the ID: " + id);
	}

}
