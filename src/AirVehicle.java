public class AirVehicle extends Vehicle implements VehicleInterface {
    private int numberOfEngines;
    private String planeClassification;

    public AirVehicle(String manufacturer, String capacity, int numberOfEngines, String planeClassification){
        super(manufacturer,capacity);
        this.numberOfEngines = numberOfEngines;
        this.planeClassification = planeClassification;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getPlaneClassification() {
        return planeClassification;
    }

    public void setPlaneClassification(String planeClassification) {
        this.planeClassification = planeClassification;
    }



    @Override
    public void printVehicleDetails()
    {
        System.out.println("Plane manufacturer : " + manufacturer + ' ' + "Carrying capacity:" + capacity + ' ' + "Number of engines: " + numberOfEngines + ' ' + "type of plane: "+ planeClassification);
    }

    @Override
    public void costOfOperations(){
        System.out.println("the cost of operating a plane is Ksh " + 20000 + "per mile");
    }


}
