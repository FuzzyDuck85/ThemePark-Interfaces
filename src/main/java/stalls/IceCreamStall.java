package stalls;

import behaviours.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name,int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name,rating , ownerName, parkingSpot);
    }
}
