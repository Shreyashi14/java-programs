public class vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void calculateFuelEfficiency(double milesDriven, double gallonsConsumed) {
        double efficiency = milesDriven / gallonsConsumed;
        System.out.println("Fuel Efficiency: " + efficiency + " mpg");
    }

    public void calculateDistanceTraveled(double milesDriven) {
        System.out.println("Distance Traveled: " + milesDriven + " miles");
    }

    public void calculateMaxSpeed(double maxSpeed) {
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }
}
