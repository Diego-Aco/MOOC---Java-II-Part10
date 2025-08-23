
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers or \"end\" to stop:");

        while (true){
            String read = scanner.nextLine();
            if (read.equals("end")) {
                break;
            }
            try {
                Integer num = Integer.valueOf(read);
                numbers.add(num);
            } catch (Exception e) {
                System.out.println(String.format("Error: %s\nPlease enter integers and not strings.", e));
            }
        }
        
        //calling our method and printing the resulting list of pos numbers
        List<Integer> posNums = positive(numbers);
        posNums.stream().forEach(n->System.out.println(n));
        //System.out.println(posNums);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(num -> num >0).collect(Collectors.toList());
    }

}
