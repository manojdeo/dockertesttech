package com.manoj.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockers")
public class HelloResouce {
	
	@GetMapping
	public String getMessage() {
		return "hello";
	}

}
