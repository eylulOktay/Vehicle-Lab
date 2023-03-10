package vehicle;

public abstract class GasPoweredCar extends Car {

    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        super(make, model, startingMileage);
    }

    public GasPoweredCar (String make, String model, double mpg, double fuelCapacityGallons){
        super(make, model);
    }

    public void drive(double miles) {
        System.out.println();
    }

    public double getMPG() {
        return 0;
    }

    public double getFuelLevel() {
        return 0;
    }

    public double getFuelCapacity() {
        return 0;
    } 

    public void refillTank()  {

    }

    public double getRemainingRange() {
        return 0;
    }

    public void refillTank(double gallons) {

    }

    protected void decreaseFuelLevel(double miles) {

    }

}
