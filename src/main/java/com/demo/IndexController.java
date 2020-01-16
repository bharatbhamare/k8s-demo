package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public String sayHEllo()
	{
		return "Hello Kubernaties";
	}
	
}
