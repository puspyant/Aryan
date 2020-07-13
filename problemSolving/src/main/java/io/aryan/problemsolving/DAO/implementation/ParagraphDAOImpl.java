package io.aryan.problemsolving.DAO.implementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.aryan.problemsolving.DAO.interfaces.ParagraphDAO;
import io.aryan.problemsolving.model.Paragraph;


@Repository("paragraphDAO")
public class ParagraphDAOImpl implements ParagraphDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public int SaveParagraph(Paragraph paragraph) {
		
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
			int userId = (Integer) session.save(paragraph);
			return userId;
		}
		catch(Exception exception)
		{
			
			System.out.println("Excption while saving data into DB " + exception);
			return 0;
		}
		finally
		{
			session.flush();
		}
		
	}

	public List<Paragraph> getFilteredData(Paragraph paragraph) {
		
		Session session = null;
		try
		{
			session = sessionFactory.getCurrentSession();
			
			ArrayList<Object> list_field = new ArrayList<Object>();
			ArrayList<Object> list_value = new ArrayList<Object>();
			
			if(paragraph.getCity_name()==null || paragraph.getCity_name()==""){}else{list_field.add("city_name");list_value.add(paragraph.getCity_name());}
			if(paragraph.getParagraph()==null || paragraph.getParagraph()==""){}else{list_field.add("paragraph");list_value.add(paragraph.getParagraph_id());}

			switch (list_field.size()) {
			
			case 0:
					Query<Paragraph> query0 = session.createQuery("from paragraph");
					return query0.list();
			case 1:
				
				Query query1 = session.createQuery("from paragraph where " + list_field.get(0) +" = :value0");
				query1.setParameter("value0", list_value.get(0));
				return query1.list();
				
			case 2:
				Query query2 = session.createQuery("from paragraph where " + list_field.get(0) +" =:value0 and " + list_field.get(1) + " =:value1");
				query2.setParameter("value0", list_value.get(0));
				query2.setParameter("value1", list_value.get(1));
				return query2.list();
				
			} 
						
			return null;
		}
		
		catch(Exception exception)
		{
			System.out.println("Error while getting Filtered Data :: " + exception.getMessage());
			return null;
		}
		finally
		{
			session.flush();
		}
		
		
	}

}
