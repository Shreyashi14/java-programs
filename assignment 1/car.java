class car extends vehicle {
    public car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void displayInfo() {
        System.out.println("Car Model: " + make + " " + model);
        calculateFuelEfficiency(18.246494, 1.789);
        calculateDistanceTraveled(18.246494);
        calculateMaxSpeed(140.0);
    }
}
