package com.msproductos.Errors;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class ApiErrors {

	String message;
	List<String> details;
	HttpStatus status;
	LocalDateTime timestamp;
	public ApiErrors(String message, List<String> details, HttpStatus status, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
		this.timestamp = timestamp;
	}
	
	
}
