package com.codingdojo.abstractart;

public abstract class Art {
	private String title;
	private String author;
	private String description;
	
	public Art() {}
	public Art(String title, String description, String author) {
		this.title = title;
		this.description = description;
		this.author = author;
		
	}
	
	public abstract void viewArt();
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
