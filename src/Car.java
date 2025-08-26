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






