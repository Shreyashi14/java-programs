public class Main {
    public static void main(String[] args) {
        truck truck = new truck("Tatra", "810 4x4", 0, "Diesel");
        truck.displayInfo();
        System.out.println("\n");
        car car = new car("Virtus", "", 0, "Gasoline");
        car.displayInfo();
        System.out.println("\n");
        motorcycle motorcycle = new motorcycle("Warrior", "200", 0, "Gasoline");
        motorcycle.displayInfo();

    }
}