package io.aryan.problemsolving.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paragraph")
public class Paragraph {

	private int paragraph_id;
	private String city_name;
	private String paragraph;
	
	public Paragraph() {}
	
	public Paragraph(int paragraph_id, String city_name, String paragraph) {
		super();
		this.paragraph_id = paragraph_id;
		this.city_name = city_name;
		this.paragraph = paragraph;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getParagraph_id() {
		return paragraph_id;
	}
	public void setParagraph_id(int paragraph_id) {
		this.paragraph_id = paragraph_id;
	}
	@Column(name = "CITY", nullable = false)
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	@Column(name = "paragraph_txt", nullable = false)
	public String getParagraph() {
		return paragraph;
	}
	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	@Override
	public String toString() {
		return "Paragraph [paragraph_id=" + paragraph_id + ", city_name=" + city_name + ", paragraph=" + paragraph
				+ "]";
	}
	
		
}
