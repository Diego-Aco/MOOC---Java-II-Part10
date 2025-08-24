
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println();
        List<Book> books = readBooks("src\\books.txt");
        books.stream().forEach(book -> System.out.println(book));
    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> bookList = new ArrayList<>();
        
        try {
            //Read file one row at a time
            Files.lines(Paths.get(file))
            //convert each row to an array consisting of the comma-delimited segments
            .map(row -> row.split(","))
            //filter out any arrays of the incorrect length
            .filter(arr -> arr.length==4)
            //create a stream of Book objects
            .map(arr -> new Book(arr[0], Integer.valueOf(arr[1]), Integer.valueOf(arr[2]), arr[3]))
            //add book to the list
            .forEach(book -> bookList.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return bookList;
    }
}
