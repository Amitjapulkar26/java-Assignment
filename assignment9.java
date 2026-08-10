class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    static class Engine {
        int power = 120;

        void showEngine() {
            System.out.println("Engine Power = " + power + " HP");
        }
    }

    public static void main(String[] args) {
        Car c = new Car("Honda City");

        System.out.println("Car Model = " + c.model);

        Car.Engine e = new Car.Engine();
        e.showEngine();
    }
}