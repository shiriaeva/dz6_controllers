package com.instance.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleException(IllegalArgumentException e) {
		return new ResponseEntity<>("Некорректный ввод - должно быть не менее 1 заголовка", HttpStatus.BAD_GATEWAY);
	}
}
