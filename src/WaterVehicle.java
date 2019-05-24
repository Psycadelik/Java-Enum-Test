public class WaterVehicle extends Vehicle implements VehicleInterface{
    private int numberOfPropellers;
    private int depth;
    private String waterBodyCompliace;

    public WaterVehicle(String manufacturer, String capacity, int numberOfPropellers, int depth, String waterBodyCompliace) {
        super(manufacturer, capacity);
        this.numberOfPropellers = numberOfPropellers;
        this.depth = depth;
        this.waterBodyCompliace = waterBodyCompliace;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getWaterBodyCompliace() {
        return waterBodyCompliace;
    }

    public void setWaterBodyCompliace(String waterBodyCompliace) {
        this.waterBodyCompliace = waterBodyCompliace;
    }

    @Override
    public void printVehicleDetails()
    {
        System.out.println(manufacturer + capacity + numberOfPropellers + depth);
    }

    @Override
    public void costOfOperations(){
        if(waterBodyCompliace == "Dhows"){
            System.out.println("the cost of operating a Dhow is Ksh " + 100 + "per mile");
        }else if(waterBodyCompliace == "Ferries"){
            System.out.println("the cost of operating a Ferry is Ksh " + 12000 + "per mile");
        }else if(waterBodyCompliace == "Ships"){
            System.out.println("the cost of operating a Ship is Ksh " + 22000 + "per mile");
        }

    }

}
