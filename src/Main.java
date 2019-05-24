public class Main {

    public static void main(String[] args) {

//        air plane = new air(2);
//        air.values();
//
        AirVehicle airVehicle = new AirVehicle("Boeing","350 people",4,"passenger");
        airVehicle.printVehicleDetails();
        airVehicle.costOfOperations();

        WaterVehicle waterVehicle = new WaterVehicle("GoPro","20 people",2,2, "river");
        waterVehicle.printVehicleDetails();
        waterVehicle.costOfOperations();

        LandVehicle landVehicle = new LandVehicle("Range Rover","5 people",4,"Petrol","Luxury");
        landVehicle.printVehicleDetails();
        landVehicle.costOfOperations();
    }
}
