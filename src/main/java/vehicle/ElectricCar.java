package vehicle;

public class ElectricCar extends Car{
    
    private double c_maxMiles = 0; 
    private double current_charge;
    
    public ElectricCar(String make, String model, double startingMileage, double milesOnMaxCharge){
        super(make,model,startingMileage);
        c_maxMiles = milesOnMaxCharge;
        current_charge = c_maxMiles;
        if (c_maxMiles < 0){
            throw new IllegalArgumentException();
        }
    }
    
    public ElectricCar (String make, String model, double milesOnMaxCharge) {
        super(make, model);
        if (milesOnMaxCharge < 0){
            throw new IllegalArgumentException();
        }
    }
   
    public void drive(double miles){
        if(miles < 0){
            throw new IllegalArgumentException();
        }
        if(miles > getRemainingRange()){
            throw new IllegalArgumentException();
        }
        addMileage(miles);
        decreaseCharge(miles);
    }
   
    public double getRemainingRange() {
        return current_charge;
    }
   
    public double getMaxRange() {
        return c_maxMiles;
    }
   
    public void recharge() {
        current_charge = c_maxMiles;
    }
   
    protected void decreaseCharge(double miles) {
        current_charge -= miles;
    }
}
