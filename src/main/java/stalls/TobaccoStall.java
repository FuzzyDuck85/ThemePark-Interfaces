package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 17) {
            return false;
        } else {
            return true;
        }
    }
}
