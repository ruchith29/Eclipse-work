package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerClass {
	
	
	@GetMapping("/home")
	public String showValues() {
		return "index";
	}

	@PostMapping("/main")
	public String welcomeValues(Model model,@RequestParam String username, @RequestParam String password) {
		return "main";
	}

}
