import java.util.Scanner;

class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageText = sc.nextLine();

        int age = Integer.parseInt(ageText);

        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}