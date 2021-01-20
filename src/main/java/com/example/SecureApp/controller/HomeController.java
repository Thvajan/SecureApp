package com.example.SecureApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home.html";
//		return ("<h1>Welcome Home</h1>");
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.html";
	}
	
	@RequestMapping("/logout-done")
	public String logoutPage() {
		return "logout.html";
	}
}
