package vehicle;

public abstract class GasPoweredCar extends Car {
    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        System.out.println();
    }

    public GasPoweredCar (String make, String model, double mpg, double fuelCapacityGallons){

    }

    public void drive(double miles) {
        System.out.println();
    }

    public double getMPG() {
        System.out.println();
    }

    public double getFuelLevel() {
        System.out.println();
    }

    public double getFuelCapacity() {
        
    } 

    public void refillTank()  {

    }

    public double getRemainingRange() {

    }

    public void refillTank(double gallons) {

    }

    protected void decreaseFuelLevel(double miles) {

    }

}
