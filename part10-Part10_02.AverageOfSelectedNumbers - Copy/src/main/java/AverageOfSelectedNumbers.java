
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        // write your code below

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }

        System.out.println();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String negOrPos = scanner.nextLine();

        if (negOrPos.equals("n")) { // negative numbers
            double negAverage = numbers.stream().mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + negAverage);
        }
        if (negOrPos.equals("p")) { // positive numbers
            double posAverage = numbers.stream().mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + posAverage);
        }

    }
}
