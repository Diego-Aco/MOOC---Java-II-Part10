import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise

         //test the method here
        Scanner scan = new Scanner(System.in);
        Checker checker = new Checker();


        System.out.println();
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        //boolean isCorrect = checker.isDayOfWeek(str);
        //boolean isCorrect = checker.allVowels(str);
        boolean isCorrect = checker.timeOfDay(str);


        if (isCorrect){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
    }
}
