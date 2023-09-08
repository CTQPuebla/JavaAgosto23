package com.msproductos.Advice;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.msproductos.Errors.ApiErrors;
import com.msproductos.Exception.ResourceNotFoundException;
import com.msproductos.Exception.BuscarException;
import com.msproductos.Exception.RefrigeradoException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
		HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Request method not supporte");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Media tyoe not supported");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Missing Path Variable");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("MissingServlet is missing");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("TypeMismatch of type");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
		HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Request bdy not redeable");
		ApiErrors errors = new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(errors);
	}
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Error al guardar");
		ApiErrors errors = new ApiErrors(message,details,HttpStatus.BAD_REQUEST,LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
	
	@ExceptionHandler(RefrigeradoException.class)
	public ResponseEntity<Object> handleRefrigeradoException(RefrigeradoException ex)
	{
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Error al guardar");
		ApiErrors errors = new ApiErrors(message,details,HttpStatus.BAD_REQUEST,LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
	
	@ExceptionHandler(BuscarException.class)
	public ResponseEntity<Object> handleBuscarException(BuscarException ex)
	{
		String message= ex.getMessage();
		List<String> details = new ArrayList<>();
		details.add("Dato no encontrado");
		ApiErrors errors = new ApiErrors(message,details,HttpStatus.BAD_REQUEST,LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
	
	
	

}

