package pl.edu.agh.mwo;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TripManagerTest {

	TripManager tripManager;
	Trip trip;
	
	@Before
	public void setUp() {
		tripManager = new TripManager();
		trip = new Trip("nazwa", "opis");
	}
	
	@Test
	public void testAdd() throws TripAlreadyExistsException {
		assertEquals(0, tripManager.getTrips().size());
		tripManager.add(trip);
		assertEquals(1, tripManager.getTrips().size());
	}

	@Test(expected = TripAlreadyExistsException.class)
	public void testAddTripTwice() throws TripAlreadyExistsException {
		assertEquals(0, tripManager.getTrips().size());
		tripManager.add(trip);
		assertEquals(1, tripManager.getTrips().size());
		tripManager.add(trip);
	}

	@Test
	public void testRemoveTrip() throws Exception {
		tripManager.add(trip);
		assertEquals(1, tripManager.getTrips().size());
		tripManager.remove(trip.getName());
		assertEquals(0, tripManager.getTrips().size());
		//fail("chcemy zespuc");
		}
	
	@Test
	public void testFindTripEmptyString() throws Exception {
		tripManager.add(trip);
		assertEquals(trip,tripManager.findTrip(""));
	}

	@Test
    public void testFindTripByName() throws TripAlreadyExistsException {
	    Trip trip1 = new Trip("trip1","trip2");
	    trip.setName("trip1");
        tripManager.add(trip);
	    tripManager.add(trip1);
		List<Trip> results = tripManager.findTrip("trip1");
	    assertEquals(1, results.size());
	    assertEquals(trip, results.get(0));
    }
	
    @Test
    public void testFindTripByDescription() throws TripAlreadyExistsException {
        Trip trip1 = new Trip("trip1","trip2");
        trip.setDescription("trip1");
        tripManager.add(trip1);
        tripManager.add(trip);
		List<Trip> results = tripManager.findTrip("trip1");
		assertEquals(1, results.size());
		assertEquals(trip, results.get(0));
	}
    
    
    @Test
	public void testFindByComment() throws TripAlreadyExistsException {
		Photo photo = new Photo();
		photo.setComment("Nice photo");
		trip.addPhoto(photo);

		Photo photo1 = new Photo();
		photo1.setComment("great photo");
		Trip trip1 = new Trip("trip1","trip2");
		trip1.addPhoto(photo1);
		tripManager.add(trip);
		tripManager.add(trip1);
		List<Trip> results = tripManager.findTrip("great photo");
		assertEquals(1, results.size());
		assertEquals(trip1, results.get(0));
	}
	
}
