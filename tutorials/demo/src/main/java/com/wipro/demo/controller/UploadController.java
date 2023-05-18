package com.wipro.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Controller
public class UploadController {

	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello World!");
		return "view_upload";
	}
	
	   @PostMapping("/upload")
	    public RedirectView singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   RedirectAttributes redirectAttributes) {
	        if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	            return new RedirectView("/uploadstatus", true);
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        try {
	        	File input = convertMultiPartToFile(file);
	            CsvSchema csv = CsvSchema.emptySchema().withHeader();
	            CsvMapper csvMapper = new CsvMapper();
	            MappingIterator<Map<?, ?>> mappingIterator =  csvMapper.reader().forType(Map.class).with(csv).readValues(input);
	            List<Map<?, ?>> list = mappingIterator.readAll();
	           System.out.println(list);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	        
	        
	        
	        
	            redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
  
	        return new RedirectView("/uploadstatus", true);
	    }
	   
	    @GetMapping("/uploadstatus")
	    public String uploadStatus() {
	        return "uploadstatus";
	    }

	    
	    private File convertMultiPartToFile(MultipartFile file ) throws IOException {
	        File convFile = new File( file.getOriginalFilename() );
	        FileOutputStream fos = new FileOutputStream( convFile );
	        fos.write( file.getBytes() );
	        fos.close();
	        return convFile;
	    }


}
