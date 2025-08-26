class Motorcycle extends VehicleClass{
    boolean sidecar;

    Engine cycleEngine = new Engine();

    public Motorcycle(String CycleBrand, String CycleModel, int CycleYear, boolean HasSidecar, int CyclePower, String CycleType){
        model = CycleModel;
        brand = CycleBrand;
        year = CycleYear;
        sidecar = HasSidecar;
        cycleEngine.Horsepower = CyclePower;
        cycleEngine.Type = CycleType;
    }

    public String cycleInfo(){
        return vehicleInfo() + ", has sidecar: " + sidecar;
    }
} // end motorcycle