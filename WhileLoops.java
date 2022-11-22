public class WhileLoops {
    public static void main(String[] args) {
        int number = 5;
        int multiplier= 1;

        // while loop
        while (multiplier <= 12) {
            System.out.print(String.format("%d X %d = %d \n", number, multiplier, number * multiplier));

            multiplier++;
        }

        multiplier = 1;
        System.out.println("\n");
        // do-while loop
        do {
            System.out.print(String.format("%d X %d = %d \n", number, multiplier, number * multiplier));

            multiplier++;
        } while (multiplier <= 12);
    }
}
