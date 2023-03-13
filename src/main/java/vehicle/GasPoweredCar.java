package vehicle;

public abstract class GasPoweredCar extends Car {
    public double mileage;
    public double fuelCapacity;
    public double fuelLevel;
    public double mpg;

    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        super(make, model, startingMileage);
        
        this.fuelCapacity = fuelCapacityGallons;
        this.mpg = mpg;
        fuelLevel = fuelCapacity;
        if(mpg <= 0 || fuelCapacityGallons <= 0) {
            throw new IllegalArgumentException();
        }

    }

    public GasPoweredCar (String make, String model, double mpg, double fuelCapacityGallons){
        super(make, model);
       
        if(mpg <= 0 || fuelCapacityGallons <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void drive(double miles) {
        if(miles <= 0 || miles > getRemainingRange()) {
            throw new IllegalArgumentException();
        }
        addMileage(miles);
        decreaseFuelLevel(miles/getMPG());
    }

    public double getMPG() {
        return mpg;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    } 

    public void refillTank()  {
        fuelLevel = fuelCapacity;
    }

    public double getRemainingRange() {
        return fuelLevel * mpg;
    }

    public void refillTank(double gallons) {
        if(gallons <= 0 || gallons + fuelLevel > fuelCapacity) {
            throw new IllegalArgumentException();
        }
        fuelLevel += gallons;
    }

    protected void decreaseFuelLevel(double miles) {
        fuelLevel -= miles/mpg;
    }

}
