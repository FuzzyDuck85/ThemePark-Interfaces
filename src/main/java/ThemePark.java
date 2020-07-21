
import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall>stalls;

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
        for(Attraction attraction : this.attractions){
            allReviewed.add(attraction);
        }
        for(Stall stall : this.stalls){
            allReviewed.add(stall);
        }
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visitAttraction(attraction);
        attraction.visited();
    }
}
