class Employee {
    static double taxRate;

    static {
        taxRate = 10.0;
        System.out.println("Tax rate initialized");
    }

    Employee() {
        System.out.println("Employee object created");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println("Tax Rate = " + taxRate + "%");
    }
}