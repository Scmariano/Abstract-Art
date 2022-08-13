package com.codingdojo.abstractart;

import java.util.ArrayList;
import java.util.Collections;


public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Art> museum = new ArrayList<Art> ();
		Painting p1 = new Painting("Painting One", "This is the Museums first Paiting!", "Stephen M", "Charcoal");
		Painting p2 = new Painting("Painting Two", "This is the Museums second Paiting!", "Chelsea M", "Oil" );
		Painting p3 = new Painting("Painting Three", "This is the Museums third Paiting!", "Violet M", "Acrylic" );
		Sculpture s1 = new Sculpture("Sculpture One", "This is the very first Sculpture", "Titus M", "Marble");
		Sculpture s2 = new Sculpture("Sculpture Two", "This is the second sculpture in the Museum", "Luke M", "Bronze");
		
		museum.add(p1);
		museum.add(p2);
		museum.add(p3);
		museum.add(s1);
		museum.add(s2);
		
		
		System.out.println(museum);
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}
		
	}

}
