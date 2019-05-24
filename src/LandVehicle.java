public class LandVehicle extends Vehicle implements VehicleInterface{
    private int numberOfWheels;
    private String fuelType;
    private String purpose;


    public LandVehicle(String manufacturer, String capacity, int numberOfWheels,String fuelType,String purpose){
        super(manufacturer,capacity);
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.purpose = purpose;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void printVehicleDetails()
    {
        System.out.println(manufacturer + capacity + numberOfWheels + fuelType +  purpose);
    }

    @Override
    public void costOfOperations(){
        if(purpose == "Machinery"){
            System.out.println("the cost of operating Machinery is Ksh" + 6000 + "per hour");
        }else if (purpose == "Buses"){
            System.out.println("the cost of operating Buses is Ksh" + 2000 + "per km");
        }else if (purpose == "Cars"){
            System.out.println("the cost of operating Cars is Ksh" + 1000 + "per km");
        }

    }

}
