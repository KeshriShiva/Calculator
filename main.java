import java.util.Scanner;

class Calculator {

    // Method for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    static double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                try {
                    switch (choice) {
                        case 1:
                            System.out.println("Result = " + add(num1, num2));
                            break;
                        case 2:
                            System.out.println("Result = " + subtract(num1, num2));
                            break;
                        case 3:
                            System.out.println("Result = " + multiply(num1, num2));
                            break;
                        case 4:
                            System.out.println("Result = " + divide(num1, num2));
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } while (choice != 5);

        System.out.println("Calculator Closed.");
        sc.close();
    }
}
