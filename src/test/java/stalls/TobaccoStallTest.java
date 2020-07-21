package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 1,"Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating() {
        assertEquals(1, tobaccoStall.getRating());
    }

    @Test
    public void isAllowedToBuy(){
        Visitor visitor = new Visitor(18, 176, 75);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToBuy(){
        Visitor visitor = new Visitor(13, 150, 50);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
