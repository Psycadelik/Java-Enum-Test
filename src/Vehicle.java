
public class Vehicle {

    protected String manufacturer;
    protected String capacity;
//    protected double runningCost;

    public Vehicle(String manufacturer, String capacity)
    {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
//        this.runningCost = runningCost;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public  String getCapacity()
    {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

//    public double getRunningCost()
//    {
//        return runningCost;
//    }
//
//    public void setRunningCost(double runningCost){
//        this.runningCost = runningCost;
//    }

    public void printVehicleDetails()
    {
        System.out.println(manufacturer + capacity);
    }
}
