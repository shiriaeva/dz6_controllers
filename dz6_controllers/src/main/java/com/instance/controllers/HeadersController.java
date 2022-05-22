package com.instance.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class HeadersController {

	@GetMapping("/headers")
	public ResponseEntity<String> listHeaders(@RequestHeader Map<String, String> headers) {
		if (headers.size() < 2) {
			throw new IllegalArgumentException();
		}

		var response = new StringBuilder();
		headers.forEach((key, value) -> response.append("Header ").append(key).append(" ").append(value).append("\n"));
		return new ResponseEntity<String>(response.toString(), HttpStatus.OK);
	}

	@PostMapping("/add_id")
	public ResponseEntity<Product> addId(@RequestBody Product product) {
		product.getInfo().setId();
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}
