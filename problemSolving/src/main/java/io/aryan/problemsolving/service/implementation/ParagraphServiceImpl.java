package io.aryan.problemsolving.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.aryan.problemsolving.DAO.interfaces.ParagraphDAO;
import io.aryan.problemsolving.model.Paragraph;
import io.aryan.problemsolving.service.interfaces.ParagraphService;

@Service("paragraphService")
public class ParagraphServiceImpl implements ParagraphService {

	@Autowired
	ParagraphDAO paragraphDAO;
	
	@Transactional
	public int SaveParagraph(Paragraph paragraph) {
		return paragraphDAO.SaveParagraph(paragraph) ;
	}

	@Transactional
	public List<Paragraph> getFilteredData(Paragraph paragraph) {
		return paragraphDAO.getFilteredData(paragraph);
	}

}
