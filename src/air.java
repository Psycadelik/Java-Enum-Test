public enum air implements VehicleInterface {

    BOEING(4),
    FOKKER(2);

    public int numberOfEngines;

     air(int numberOfEngines){
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void costOfOperations(){
        System.out.println("Cargo : " + FOKKER + "has " + numberOfEngines + " engines");
        System.out.println("passenger : " + BOEING + "has " + numberOfEngines + " engines");
    }
}
