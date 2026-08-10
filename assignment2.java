import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        int fine = 0;

        if (days > 0) {
            fine = days * 5;
        }

        System.out.println("Fine = Rs. " + fine);
    }
}