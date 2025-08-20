class Car extends VehicleClass {
    int doors;

    Engine carEngine = new Engine();

    public Car(String CarBrand, String CarModel, int CarYear, int CarDoors, int CarPower, String CarType) {
        model = CarModel;
        brand = CarBrand;
        year = CarYear;
        doors = CarDoors;
        carEngine.Horsepower = CarPower;
        carEngine.Type = CarType;
    }

    public String carInfo(){
        return vehicleInfo() + ", has: " + doors + " doors";
    }
}// end car

class Motorcycle extends VehicleClass{
    boolean sidecar = false;

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



