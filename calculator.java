import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scan.nextInt();

        System.out.println(" 1- Addition\n 2- Subtraction\n 3- Multiplication\n 4- Division");
        System.out.println("Enter your choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0)
                    System.out.println(n1 / n2);
                else
                    System.out.println("cannot be divided by 0");
                break;
            default:
                System.out.println("Please enter a valid value (1-4)");
        }
        scan.close();

    }
}
