import java.util.Scanner;

public class calculator06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        double result = 0;

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("Division by zero isn't allowed!");
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("The result is: " + result);
    }
}
