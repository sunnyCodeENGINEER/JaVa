public class ForLoops {
    public static void main(String[] args) {
        // for (start, end-if-false statement, increament)
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        // looping over arrays
        int sum = 0;
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            System.out.print(String.format("%d + ", numbers[index]));
        }


        System.out.printf("0 = %d", sum);

        // nested for loops
        for (int number = 1; number < 13; number++) {
            for (int multiplier = 1; multiplier < 13; multiplier++) {
                System.out.print(String.format("%d X %d = %d\n", number, multiplier, number * multiplier));
            }
            System.out.println("\n");
        }

        // nicer way of looping over arrays
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
