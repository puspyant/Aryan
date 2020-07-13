package io.aryan.problemsolving.service.interfaces;

import java.util.List;

import io.aryan.problemsolving.model.Paragraph;

public interface ParagraphService {
	
	public int SaveParagraph(Paragraph paragraph);
	
	public List<Paragraph> getFilteredData(Paragraph paragraph);

}
