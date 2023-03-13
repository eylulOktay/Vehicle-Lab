package vehicle;

public class FordFrivolous extends GasPoweredCar implements Flying, SelfDriving{
    public FordFrivolous(double startingMileage){
        super("Ford", "Frivolous",startingMileage,23.6,20);
    }
    public FordFrivolous(){
        this(0);
    }
    public void driveAutonomously(double miles){
        if (canDrive(miles*2)){
            decreaseFuelLevel(getMPG()/miles);
            drive(miles);
        }
        else{
            drive(getRemainingRange()/2);
            decreaseFuelLevel(getMPG()/getRemainingRange());
        }

    }
    public boolean canFly(double miles){
        return canDrive(miles*3);
    }

    public void fly(double miles){
        
    }
}
