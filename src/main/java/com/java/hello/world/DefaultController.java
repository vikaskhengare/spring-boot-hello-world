package com.java.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping("/")
	public String getMessage() {
		return "This is default message - try /hello/world";
	}
}
