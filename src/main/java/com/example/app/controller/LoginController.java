package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String index() throws Exception {
		test();
		return "login";
	}

	private void test() throws Exception {
	}
}
