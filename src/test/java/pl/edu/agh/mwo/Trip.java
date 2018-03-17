package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {

	Collection<Photo> photos = new ArrayList<Photo>();
	
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

}
