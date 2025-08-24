
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        ArrayList<Book> books = new ArrayList();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation as an int: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, ageRec));
            System.out.println();
        }

        System.out.println(String.format("%s books in total.", books.size()));
        System.out.println();

        //Order the books by age recommendation, then title
        Comparator<Book> comparator = Comparator
            .comparing(Book::getAgeRecommendation)
            .thenComparing(Book::getTitle);

        Collections.sort(books, comparator);

        System.out.println("Books:");
        books.stream().forEach(book->System.out.println(book));

    }

}
