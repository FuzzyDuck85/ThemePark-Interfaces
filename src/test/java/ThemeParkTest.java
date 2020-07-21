import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;
import people.Visitor;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private RollerCoaster rollerCoaster;
    private Playground playground;
    private Park park;
    private Dodgems dodgems;
    private ThemePark themePark;
    private Visitor visitor;
    private TobaccoStall tobaccoStall;

    @Before
    public void setup() throws Exception{
        candyflossStall = new CandyflossStall("Candy Land", 5, "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", 5, "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", 2, "Jack Jarvis", ParkingSpot.B1);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        park = new Park("Leafy Meadows", 9);
        dodgems = new Dodgems("Bumper Cars", 5);
        themePark = new ThemePark("Code World");
        visitor = new Visitor(20, 180, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Code World", themePark.getName());
    }

    @Test
    public void canAddAttractionsAndStalls(){
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(park);
        themePark.addStall(iceCreamStall);
        assertEquals(2, themePark.getAttractions().size());
        assertEquals(1, themePark.getStalls().size());
    }

    @Test
    public void canGetReviewed(){
        themePark.addAttraction(playground);
        themePark.addAttraction(park);
        themePark.addStall(tobaccoStall);
        themePark.addStall(candyflossStall);
        assertEquals(4, themePark.getAllReviewed().size());
    }

    @Test
    public void visitorCanVisitAttraction(){
        themePark.visit(visitor, rollerCoaster);
        themePark.visit(visitor, dodgems);
        assertEquals(2, visitor.getVisitedAttractions().size());
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(1, dodgems.getVisitCount());
    }
}
