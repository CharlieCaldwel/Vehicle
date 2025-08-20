public class VehicleClass {
String brand;
String model;
int year;


boolean vehicleOn = false;


public void startVehicle(){
    vehicleOn = true;
}

public void stopVehicle(){
    vehicleOn = false;
}


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