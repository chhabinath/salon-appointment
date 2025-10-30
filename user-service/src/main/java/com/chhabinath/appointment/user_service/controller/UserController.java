package com.chhabinath.appointment.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chhabinath.appointment.user_service.model.User;
import com.chhabinath.appointment.user_service.repository.UserRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/salon")
public class UserController {
	
	private final UserRepository userRepository;
	
	@PostMapping("/user")
	public User createUser(@RequestBody @Valid User user) {
		return userRepository.save(user);
	}

	@GetMapping("/users")
	public User getUser() {
		return User.builder().email("abc@ausi.com")
				.username("Chhabinath")
				.phone(390180392l)
				.role("USER")
				.build();
	}
}
