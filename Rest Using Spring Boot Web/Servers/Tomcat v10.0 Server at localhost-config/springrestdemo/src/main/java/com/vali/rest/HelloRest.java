package com.vali.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRest {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
