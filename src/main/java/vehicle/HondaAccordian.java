package vehicle;

public class HondaAccordian extends GasPoweredCar{
    private int c_year;
    public HondaAccordian(double startingMileage, int modelYear){
        super("Honda", "Accordian",startingMileage,33.2,14.5);
        c_year = modelYear;
    }
    public HondaAccordian(int modelYear){
        this(0,modelYear);
    }
   
    public String toString() {
        
        return c_year + " " + super.toString();
    }
}
