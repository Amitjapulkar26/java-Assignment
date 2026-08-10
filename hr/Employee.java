package hr;

public class Employee {
    public String name = "Amit";
    protected int salary = 30000;
    private String password = "1234";

    public void showPrivate() {
        System.out.println("Private password = " + password);
    }
}