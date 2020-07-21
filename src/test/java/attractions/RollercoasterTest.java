package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        Visitor visitor = new Visitor(13, 150, 50);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void chargesDouble(){
        Visitor visitor = new Visitor(26, 201, 80);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);

    }

    @Test
    public void isAllowedToRide(){
        Visitor visitor = new Visitor(13, 150, 50);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToRideTooYoung(){
        Visitor visitor = new Visitor(10, 150, 50);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToRideTooSHort(){
        Visitor visitor = new Visitor(68, 119, 5000);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));

    }
}
