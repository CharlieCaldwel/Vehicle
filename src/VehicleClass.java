public class VehicleClass {
String brand;
String model;
int year;


boolean vehicleOn = false;

// Turn on Vehicle
public void turnOnVehicle(){
    vehicleOn = true;
}

public void turnOffVehicle(){
    vehicleOn = false;
}

// Get Vehicle Info
public String vehicleInfo(){
    return "Model: " + model + ", " + "Brand: " + brand + ", " + "Year: " + year;
}

} // end Vehicle

class Engine{
    int Horsepower;
    String Type;
    String enInfo;

    public String engineInfo(){
        return enInfo = "Horsepower: " + Horsepower + ", " + "Fuel type: " + Type;
    }

} // end engine