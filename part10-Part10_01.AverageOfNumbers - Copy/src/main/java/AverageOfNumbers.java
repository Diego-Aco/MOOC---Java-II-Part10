
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        // Write your program here

        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Double.valueOf(input));
        }

        double average = 0.0;

        if (!numbers.isEmpty()) {
            average = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .average()
                .getAsDouble();
        }
        System.out.println("average of the numbers: " + average);

    }
}
