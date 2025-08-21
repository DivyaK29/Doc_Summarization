public class SimpleCalculator {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
    }
}
