package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalendarController {

	@RequestMapping("/calender")
	public String index() {
		return "calendar";
	}
}
