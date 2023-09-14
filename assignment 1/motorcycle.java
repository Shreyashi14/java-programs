class motorcycle extends vehicle {
    public motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void displayInfo() {
        System.out.println("Motorcycle Model: " + make + " " + model);
        calculateFuelEfficiency(5.86, 4.5);
        calculateDistanceTraveled(5.86);
        calculateMaxSpeed(90.0);
    }
}
