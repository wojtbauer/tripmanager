package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.Test;

public class TripManagerTest {
	

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
		Trip trip1 = new Trip("Vienna", "familytrip");
		Trip trip2 = new Trip("Florida", "familytrip");
		tripManager.addTrip(trip1);
		tripManager.addTrip(trip2);
		assertEquals ("Florida", tripManager.findTrip("Florida"));
	
	}
	
	@Test
	public void testNoTripFound() {
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("Vienna", "familytrip");
		Trip trip2 = new Trip("Florida", "familytrip");
		tripManager.addTrip(trip1);
		tripManager.addTrip(trip2);
		assertNull (tripManager.findTrip("Greece"));
	
	}
	
	@Test
	public void testGetTrips() {
		TripManager tripManager = new TripManager();
		Trip trip1 = new Trip("Vienna", "familytrip");
		Trip trip2 = new Trip("Florida", "familytrip");
		tripManager.addTrip(trip1);
		tripManager.addTrip(trip2);
		Collection<Trip> expectedTrip = new ArrayList<Trip>();
		expectedTrip.add(trip1);
		expectedTrip.add(trip2);
		assertEquals(expectedTrip, tripManager.getTrips());

			}
}