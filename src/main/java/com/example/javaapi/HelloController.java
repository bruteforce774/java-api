package com.example.javaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private String message = "Hello, world!";

	@GetMapping("/hello")
	public String hello() {
		return message;
	}

	@PostMapping("/hello")
	public String update(@RequestBody String body) {
		message = body;
		return "Updated!";
	}

}
