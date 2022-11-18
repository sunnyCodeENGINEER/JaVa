// Arithmetic operators in Java
// Emmanuel Donkor
// 11/18/2022


public class ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 6;

        // addition
        System.out.println(number1 + number2);

        // subtraction
        System.out.println(number1 - number2);

        // multiplication
        System.out.println(number1 * number2);

        // division
        System.out.println(number1 / number2);

        // modulus (modulo/remainder)
        System.out.println(number1 % number2);

        // incrementing variables
        number1 += 5;
        System.out.println(number1);
        number1 ++;
        System.out.println(number1);
        ++number1;
        System.out.println(number1);

        // decrementing variables
        number2 -= 8;
        System.out.println(number2);
        number2 --;
        System.out.println(number2);
        --number2;
        System.out.println(number2);
    }
}
