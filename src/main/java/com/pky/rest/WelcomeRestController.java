package com.pky.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeRestController {
	
	@GetMapping(value = "/welcome/{name}")
	public String generateWelcomeMsg(@PathVariable("name") String name) {
		String msg=name +"  Welcome To RestController !!";
	    return msg;
	}

}
