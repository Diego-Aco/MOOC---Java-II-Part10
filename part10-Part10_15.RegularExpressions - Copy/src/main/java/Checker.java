import java.util.Scanner;

public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]+");
    }

    public boolean timeOfDay(String str) {
        return str.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }

}
