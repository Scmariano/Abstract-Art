package com.codingdojo.abstractart;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture() {}
	public Sculpture (String title, String description, String author, String material) {
		super(title, description, author);
		this.material = material;
	}
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.getTitle() +"\n"+ "Desciption: " + this.getDescription() + "\n" + "Author: "
				+ this.getAuthor() + "\n" + "Material: " + this.getMaterial());
	}

}
