class Driver {
    String name;
    String status;

    Driver(String name) {
        this.name = name;
        status = "Available";
    }
}

class Trip {
    Driver driver;

    Trip(Driver driver) {
        this.driver = driver;
    }

    public static void main(String[] args) {
        Driver d = new Driver("Raj");

        Trip trip1 = new Trip(d);
        Trip trip2 = new Trip(d);

        System.out.println("Trip 1 Driver Status: " + trip1.driver.status);
        System.out.println("Trip 2 Driver Status: " + trip2.driver.status);

        trip1.driver.status = "Busy";

        System.out.println("\nAfter changing status:");

        System.out.println("Trip 1 Driver Status: " + trip1.driver.status);
        System.out.println("Trip 2 Driver Status: " + trip2.driver.status);
    }
}