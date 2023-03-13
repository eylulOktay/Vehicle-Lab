package vehicle;

public class FordFrivolous extends GasPoweredCar{
    public FordFrivolous(double startingMileage){
        super("Ford", "Frivolous",startingMileage,23.6,20);
    }
    public FordFrivolous(){
        this(0);
    }
}
