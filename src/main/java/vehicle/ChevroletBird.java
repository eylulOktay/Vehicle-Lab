package vehicle;

public class ChevroletBird extends ElectricCar implements Flying{

    private boolean WingsExtended = false;

    public ChevroletBird(double startingMileage){
        super("Cheverolet", "Bird",startingMileage, 250);
        WingsExtended = false;
    }

    public ChevroletBird(){
        this(0);
    }

    public boolean checkWingsExtended(){
        if (WingsExtended == true){
            return true;
        }
        else{
            return false;
        }
    }

    public void drive(double miles){
        WingsExtended = false;
        super.drive(miles);
    }

    public boolean canFly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException();
        }

        return true;
    }

    public void fly(double miles){
        if(miles < 0){
            throw new IllegalArgumentException();
        }

        if(miles > getRemainingRange()){
            throw new IllegalArgumentException();
        }
        decreaseCharge(miles);
    }
}
