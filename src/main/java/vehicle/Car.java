package vehicle;
import java.util.List;

public abstract class  Car {
    public Car(String make, String model, double startingMileage){

    }

    public Car(String make, String model){

    }

    public boolean canDrive(double miles){
        return false;

    }
    public void drive(double miles){

    }
    public String toString(){
        return "";
    }
    public double getMileage(){
        return 0;
    }
    public String getMake(){
        return "";
    }
    public String getModel(){
        return "";
    }
    public abstract double getRemainingRange();
    protected void addMileage(double miles){

    }
    public int roadTrip(List<Double> milesEachDay){
        return 0;
    }
}
