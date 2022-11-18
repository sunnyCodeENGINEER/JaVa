// Logical operators in Java
// Emmanuel Donkor
// 11/18/2022

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;
        boolean islibraryMember = true;

        // logical and operator
            // age >= 18
            // age <= 40
        System.out.println(age >= 18 && age <= 40);

        // logical or operator
        System.out.println(isStudent || islibraryMember); 

        // logical not operator
        System.out.println(isStudent);
        System.out.println(!isStudent);
    }
}
