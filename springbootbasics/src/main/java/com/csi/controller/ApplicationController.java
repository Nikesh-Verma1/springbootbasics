package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		return "WELCOME TO FINTECH CSI";
	}

	@GetMapping("/services")
	public String sayServices() {
		return "SOFTWARE DEVELOPMENT SERVICES";
	}

	@GetMapping("/address")
	public String sayAddress() {
		return "INSPIRIA | PUNE | MH | INDIA";
	}


}
