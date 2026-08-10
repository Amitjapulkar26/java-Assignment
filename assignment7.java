class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Instance method
    double calculateBonus() {
        return salary * 10 / 100;
    }

    // Static method
    static double taxSlab() {
        return 20.0;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 30000);
        Employee e2 = new Employee("Rahul", 40000);

        System.out.println(e1.name + " Bonus = Rs. " + e1.calculateBonus());
        System.out.println(e2.name + " Bonus = Rs. " + e2.calculateBonus());

        System.out.println("Company Tax Slab = " + Employee.taxSlab() + "%");
    }
}