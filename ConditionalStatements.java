import java.util.Scanner;

//Conditional Statements in Java
// Emmanuel Donkor
// 11/20/2022

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What opertion do you want to perform? ");
        String operation = scanner.nextLine();

        // if-else if-else statements
        if (operation.equalsIgnoreCase("sum")) {
            System.out.printf("%.4f + %.4f = %.4f", number1, number2, number1 + number2);
        } else  if (operation.equalsIgnoreCase("sub")) {
            System.out.printf("%.4f - %.4f = %.4f", number1, number2, number1 - number2);
        } else  if (operation.equalsIgnoreCase("div")) {
            if (number2 != 0) {
                System.out.printf("%.4f / %.4f = %.4f", number1, number2, number1 / number2);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else  if (operation.equalsIgnoreCase("mul")) {
            System.out.printf("%.4f * %.4f = %.4f", number1, number2, number1 * number2);
        }
    
         else {
            System.out.println(String.format("'%s' is not an operation.", operation));
        }

        System.out.println("");
        System.out.print("Enter first number: ");
        double number1a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter second number: ");
        double number2a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What opertion do you want to perform? ");
        String operationa = scanner.nextLine();

        switch (operationa) {
            case "sum":
                System.out.printf("%.4f + %.4f = %.4f", number1a, number2a, number1a + number2a);
                break;
            case "sub":
                System.out.printf("%.4f - %.4f = %.4f", number1a, number2a, number1a - number2a);
                break;
            case "mul":
                System.out.printf("%.4f * %.4f = %.4f", number1a, number2a, number1a * number2a);
                break;
            case "div":
                if (number2 != 0) {
                    System.out.printf("%.4f / %.4f = %.4f", number1, number2, number1 / number2);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default :
                System.out.println(String.format("'%s' is not an operation.", operationa));
        }

        scanner.close();
    }
}
