import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        System.out.println();

        // Person anna = new Person("Anna", Education.PHD);
        // Person suzy = new Person("Suzy",Education.HS);
        // Person max = new Person("Max", Education.BA);

        // ArrayList<Person> people = new ArrayList<>();
        // people.add(anna);
        // people.add(suzy);
        // people.add(max);

        // Employees employees = new Employees();
        // employees.add(people);

        // //print statements below

        // employees.print();

        // System.out.println();

        // employees.print(Education.HS);

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();

    }
}
