// Taking user inputs in Java
// Emmanuel Donkor
// 11/19/2022

import java.util.Scanner;

public class TakingInputsFromUSer {
    public static void main(String[] args) {
// HOW TO RECEIVE INPUTS FROM USER.
        // create a scanner object.
        // send a prompt to user for the needed data.
        // set string variable to scanner object's next line method.
        // or set integer variable to scanner object,s next int method.
        // use your data received from user.
        // close scanner object using close method.


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        // clears input buffer
        scanner.nextLine();
        // or
        int age2 = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Your name is %s and you are %d years old.", name, age));
        System.out.println(age2);
        scanner.close();
    }
}
