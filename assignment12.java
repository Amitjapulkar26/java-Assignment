class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary = salary + amount;
            System.out.println("Salary increased successfully");
        } else {
            System.out.println("Salary cannot be decreased");
        }
    }

    public void showSalary() {
        System.out.println("Salary = Rs. " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(30000);

        e.showSalary();

        e.increaseSalary(5000);
        e.showSalary();

        e.increaseSalary(-2000);
        e.showSalary();
    }
}