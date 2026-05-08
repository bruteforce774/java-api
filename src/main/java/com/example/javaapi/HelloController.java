package com.example.javaapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private List<Map<String, Object>> items = new ArrayList<>();

	@GetMapping("/hello")
	public List<Map<String, Object>> getItems() {
		return items;
	}

	@PostMapping("/hello")
	public Map<String, Object> addItem(@RequestBody Map<String, Object> body) {
		items.add(body);
		return body;
	}

}
