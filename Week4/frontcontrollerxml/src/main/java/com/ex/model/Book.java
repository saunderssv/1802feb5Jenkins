package com.ex.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Book {
	
	private String title;
	private String author;
	private Integer year;
	
	public Book(){}

	public Book(String title, String author, Integer year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
}
