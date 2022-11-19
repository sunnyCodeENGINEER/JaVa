// Strings in Java
// Emmanuel Donkor
// 11/19/2022

public class StringClass {
    public static void main(String[] args) {
        String name = "Emma"; //%s
        String country = "Ghana"; //%s
        String comapny = "sunnyCodeENGINEER"; //%s
        int age = 20; //%d
        double cwa = 83.96; //%f
        char percentSign = '%'; //%c
        boolean isTrue = false; //%b

        System.out.println(name);

        // formatting strings
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My cwa is %.4f. I have attended 100%c of all my classes and these are all %b claims.", name, country, age, comapny, cwa, percentSign, isTrue);

        System.out.println(formattedString);

        // length of a string
        System.out.println(formattedString.length());
        System.out.println(formattedString.isEmpty());

        // changing case of a string
        System.out.println(formattedString.toUpperCase());
        System.out.println(formattedString.toLowerCase());

        // checking for equal strings
        String country2 = "GHANA"; 
        System.out.println(name.equals(country));
        System.out.println(country.equals(country2));
        System.out.println(country.equalsIgnoreCase(country2));

        // replacing parts of a string
        String string1 = "The sky is blue.";
        System.out.println(string1);
        System.out.println(string1.replace("blue", "red"));
        System.out.println(string1);

        // check if a string contains a particular word
        System.out.println(string1.contains("sky"));
    }
}