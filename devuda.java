import java.util.Scanner;

class Devuda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Crispy Calculator!");
        System.out.println("---------------------------------");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please run the program again.");
        }

        if (validChoice) {
            System.out.println("Thank you for using the Crispy Calculator!");
        } else {
            System.out.println("Program terminated due to invalid input.");
        }

        sc.close();
    }
}
