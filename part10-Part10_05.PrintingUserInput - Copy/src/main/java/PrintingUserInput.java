import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> rows = new ArrayList<>();

        System.out.println("Enter strings (or press \"enter\" to stop):");
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            rows.add(input);
        }

        rows.stream().forEach(row -> System.out.println(row));
    }
}
