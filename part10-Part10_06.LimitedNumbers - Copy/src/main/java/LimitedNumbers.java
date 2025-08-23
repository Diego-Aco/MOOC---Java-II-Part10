
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            //negative numbers stop the loop
            if (num<0) {
                break;
            }
            numbers.add(num);
        }

        numbers.stream().filter(x-> (x > 0) && (x < 6)).forEach(x -> System.out.println(x));
    }
}
