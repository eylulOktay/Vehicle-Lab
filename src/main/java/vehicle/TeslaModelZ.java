package vehicle;

public class TeslaModelZ extends ElectricCar implements SelfDriving{
    private int c_mnum;
    public TeslaModelZ(double startingMileage,int modelNum){
        super("Tesla", "Z",startingMileage,340);
        c_mnum = modelNum;
    }
    public TeslaModelZ(int modelNum){
        this(0,modelNum);
    }
    public int getModelNum(){
        return c_mnum;
    }
    public String getModel(){
        return super.getModel()+c_mnum;
    }
    public void driveAutonomously(double miles){
        if (miles > getRemainingRange()){
            drive(getRemainingRange());
        }
        else{
            drive(miles);
        }
    };
}
