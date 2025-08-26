class Airplane extends VehicleClass{
    int engineAmount;

    Engine planeEngine = new Engine();

    public  Airplane(String PlaneBrand, String PlaneModel, int PlaneYear, int PlaneEngines, int PlanePower, String PlaneType){
        model = PlaneModel;
        brand = PlaneBrand;
        year = PlaneYear;
        engineAmount = PlaneEngines;
        planeEngine.Horsepower = PlanePower;
        planeEngine.Type = PlaneType;
    }

    public String planeInfo(){
        return vehicleInfo() + ", has: " + engineAmount + " Engines";
    }
} // end airplane