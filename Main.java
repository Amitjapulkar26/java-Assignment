class Employee10 {
    public String name = "Amit";
    protected int salary = 30000;
    private String password = "1234";

    void showDetails() {
        System.out.println("Public Name: " + name);
        System.out.println("Protected Salary: " + salary);
        System.out.println("Private Password: " + password);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee10 e = new Employee10();

        e.showDetails();

        System.out.println("Public: " + e.name);
        System.out.println("Protected: " + e.salary);

        // Private cannot be accessed directly
        // System.out.println(e.password);
    }
}
