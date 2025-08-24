
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    //note that each CSV row has 6 values
    //example of CSV row: Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
    //indices:              [0]                     [1]                 [2]         [3]                     [4]     [5]
    //Meaning:              theme                   age group       gender          country                 year    literacy%                      
    public static void main(String[] args) {
        
        List<String> rows = readLitData("literacy.csv");
        rows.stream().forEach(row -> System.out.println(row));
    }

    /*IMPORTANT NOTE! My solution below works but is a giant clumsy stream. Based on the MOOC's solution, it was
    // totally fine to create a class representing each row (called 'Result' in their example). This way I could override
        the toString method and access variables in a more readable way. The MOOC also used two separate streams, one for
        adding rows to an ArrayList of Results, then another stream for sorting the results list and printing.
    */
    public static List<String> readLitData(String file){
        try {
                return Files.lines(Paths.get(file))
                //split each country's line into arrays based on the comma delimiter
                .map(line -> line.split(","))
                //sort the arrays based from lowest to highest literacy rate
                .sorted((arr1, arr2) -> {
                    //I can't simply subtract the two values because sorted() expects an int
                    if (Double.valueOf(arr1[5]) < Double.valueOf(arr2[5])) {
                        return -1;
                    } else if (Double.valueOf(arr1[5]) > Double.valueOf(arr2[5])) {
                        return 1;
                    } else {
                        return 0;
                    }
                //now convert each array to a string in the format "{Country} (year),{gender}, {literacy rate}"
                //note that we take a substring of arr[2] so that whitespace and the "(%)" are excluded
                }).map(arr -> String.format("%s (%s), %s, %s", arr[3], arr[4], arr[2].substring(1, arr[2].indexOf(" ", 1)), arr[5]))
                .collect(Collectors.toCollection(ArrayList::new)); 

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return new ArrayList<String>();
    }
}
