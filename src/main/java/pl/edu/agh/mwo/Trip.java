package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	private String name;
	private String description;
	
	public Trip (String name, String description){
	this.name = name;
	this.description = description;
	}
	

	ArrayList <Photo> photos = new ArrayList<Photo>();
	
	public ArrayList<Photo> getPhotos() {
		return photos;
	}
	
	public String getName(){
		return name;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}
	
	
    }


