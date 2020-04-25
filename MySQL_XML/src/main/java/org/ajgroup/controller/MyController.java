package org.ajgroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/student")
	public String studentForm() {
		return "studentForm";
	}
}
