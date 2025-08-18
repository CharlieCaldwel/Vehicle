public class Main {
    public static void main(String[] args) {

        Car BMW = new Car("BMW", "BMW iX", 2025, 4, 180, "Electric");

        System.out.println("Car on: " + BMW.vehicleOn);
        System.out.println(BMW.getcarInfo());
        System.out.println(BMW.carEngine.engineInfo());

        Motorcycle Harley = new Motorcycle("Harley", "Trike", 2025, true, 240, "diesel");

        System.out.println("\nMotorCycle on: " + Harley.vehicleOn);
        System.out.println(Harley.getcycleInfo());
        System.out.println(Harley.cycleEngine.engineInfo());

        Airplane F22 = new Airplane("LockHead", "F-22", 2011, 6, 52400, "jet");

        System.out.println("\nAirplane on: " + F22.vehicleOn);
        System.out.println(F22.getplaneInfo());
        System.out.println(F22.planeEngine.engineInfo());
    }
}