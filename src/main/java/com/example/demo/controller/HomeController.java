package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Data
@Controller
public class HomeController {

	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	
}
