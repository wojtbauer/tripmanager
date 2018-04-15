package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class TripTest {

	

	@Test
	public void testAddPhoto() {
		Trip trip = new Trip("a", "family trip");
		Photo photo = new Photo();
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	
	@Test
	public void testGetPhotos() {
		Trip trip = new Trip("a", "family trip");
		Photo photo1 = new Photo();
		Photo photo2 = new Photo();
		Photo photo3 = new Photo();
		trip.addPhoto(photo1);
		trip.addPhoto(photo2);
		trip.addPhoto(photo3);
		
		Photo[] ExpectedArray = {photo1, photo2, photo3};
		Photo[] ResultArray =  (Photo[]) trip.getPhotos().toArray();
		
		assertArrayEquals(ExpectedArray, ResultArray);
	}
	
	@Test 
	public void testGetTripName (){
		Trip trip = new Trip("b", "familytrip");
		assertEquals(trip.getName(),"b");
	
	}

}
