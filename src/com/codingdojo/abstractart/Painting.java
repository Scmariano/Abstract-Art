package com.codingdojo.abstractart;

public class Painting extends Art {
	private String paintType;
	
	public Painting() {}
	public Painting(String title, String description, String author, String paintType) {
		super(title, description, author);
		this.paintType = paintType;
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.getTitle() +"\n"+ "Desciption: " + this.getDescription() + "\n" + "Author: "
				+ this.getAuthor() + "\n" + "Material: " + this.getPaintType());
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	
}
