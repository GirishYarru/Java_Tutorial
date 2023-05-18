package com.wipro.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WelcomeController {
	@GetMapping("/upload")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello World!");
		return "upload";
	}
	
	   @PostMapping("/upload")
	    public RedirectView singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   RedirectAttributes redirectAttributes) {
	        if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return new RedirectView("/uploadstatus", true);
	        }
	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
  

	        return new RedirectView("/uploadstatus", true);
	    }
	   
	    @GetMapping("/uploadstatus")
	    public String uploadStatus() {
	        return "uploadstatus";
	    }

}
