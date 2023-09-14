class truck extends vehicle {
    public truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void displayInfo() {
        System.out.println("Truck Model: " + make + " " + model + " " + year);
        calculateFuelEfficiency(32.6567976849498, 9.4646464848);
        calculateDistanceTraveled(32.6567976849498);
        calculateMaxSpeed(70.0);
    }
}
