package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	//@Test
	//public void testSubstract() {
		//Photo photo = new Photo();
		//Trip trip = new Trip();
		
//}
	
	@Test
	public void testSubstarctTrip() {
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("A", "familytrip");
		assertEquals (0, tripManager.getTrips().size());
		tripManager.addTrip(trip1);
		assertEquals (1, tripManager.getTrips().size());
		tripManager.removeTrip(trip1);
		assertEquals (0, tripManager.getTrips().size());	
}
	
	
	
	@Test
	public void testAddTrip() {
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("A", "familytrip");
		assertEquals (0, tripManager.getTrips().size());
		tripManager.addTrip(trip1);
		assertEquals (1, tripManager.getTrips().size());
}
	
	@Test
	public void testFindTrip() {
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("AB", "familytrip");
		Trip trip2 = new Trip("CD", "familytrip");
		tripManager.addTrip(trip1);
		tripManager.addTrip(trip2);
		assertEquals ("AB", tripManager.findTrip("AB"));
	
	}
	
	@Test
	public void testGetTrips() {
		//to implement
	}
}