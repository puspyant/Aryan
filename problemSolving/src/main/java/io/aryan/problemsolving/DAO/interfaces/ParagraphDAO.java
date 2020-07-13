package io.aryan.problemsolving.DAO.interfaces;

import java.util.List;


import io.aryan.problemsolving.model.Paragraph;

public interface ParagraphDAO {
	
	public int SaveParagraph(Paragraph paragraph);
	
	public List<Paragraph> getFilteredData(Paragraph paragraph);

}
