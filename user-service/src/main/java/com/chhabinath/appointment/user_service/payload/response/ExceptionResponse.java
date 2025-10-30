package com.chhabinath.appointment.user_service.payload.response;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExceptionResponse {
	private String message;
	private String error;
	private LocalDateTime timeStamp;
}
