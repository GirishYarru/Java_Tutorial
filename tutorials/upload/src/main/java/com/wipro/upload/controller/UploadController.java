package com.wipro.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadController {

	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello World!");
		return "index_latest";
	}
	

}
