package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isAllowedToPlay(){
        Visitor visitor = new Visitor(13, 150, 50);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToPlay(){
        Visitor visitor = new Visitor(18, 180, 20);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
