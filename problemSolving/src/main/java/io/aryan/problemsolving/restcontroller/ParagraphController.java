package io.aryan.problemsolving.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.aryan.problemsolving.model.Paragraph;
import io.aryan.problemsolving.service.interfaces.ParagraphService;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
public class ParagraphController {
	
	@Autowired 
	private ParagraphService paragraphService;
	
	
	@PostMapping("/saveParagraph")
	public int saveParagraphDetail(@RequestBody Paragraph paragraph) {
		
		return paragraphService.SaveParagraph(paragraph);
	}
	
	@PostMapping("/filterData")
	public List<Paragraph> getFilteredData(@RequestBody Paragraph paragraph) {
		
		return paragraphService.getFilteredData(paragraph);
	}
}
