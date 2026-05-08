package com.example.javaapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private List<Person> items = new ArrayList<>();

	@GetMapping("/hello")
	public List<Person> getItems() {
		return items;
	}

	@PostMapping("/hello")
	public Person addItem(@RequestBody Person body) {
		items.add(body);
		return body;
	}

}
