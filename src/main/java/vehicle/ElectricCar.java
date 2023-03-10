package vehicle;

public class ElectricCar extends Car{
    
    private double c_maxMiles = 0; 
    
    public ElectricCar(String make, String model, double startingMileage, double milesOnMaxCharge){
        super(make,model,startingMileage);
        c_maxMiles = milesOnMaxCharge;
        if (c_maxMiles < 0){
            throw new IllegalArgumentException();
        }
    }
    
    public ElectricCar (String make, String model, double milesOnMaxCharge) {
        mileage = 0;
        if (milesOnMaxCharge < 0){
            throw new IllegalArgumentException();
        }
    }
   
    public void drive(double miles){

    }
   
    public double getRemainingRange() {

    }
   
    public double getMaxRange() {

    }
   
    public void recharge() {

    }
   
    protected void decreaseCharge(double miles) {

    }
}
