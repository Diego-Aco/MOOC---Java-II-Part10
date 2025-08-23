

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        System.out.println();
        //Creating items
        Item toothbrush = new Item("toothbrush", 1);
        Item shirt = new Item("shirt", 2);
        Item sweater = new Item("sweater", 3);
        Item shoes = new Item("shoes", 5);
        Item laptop = new Item("suitcase", 9);
        
        //Creating suitcases
        Suitcase sc1 = new Suitcase(12);
        Suitcase sc2 = new Suitcase(15);
        Suitcase sc3 = new Suitcase(10);

        //Adding items to suitcases
        sc1.addItem(toothbrush); //weight 1
        sc1.addItem(shoes); //weight 5
        // sc1.addItem(laptop);
        // System.out.println(String.format("sc1 total weight: %s", sc1.totalWeight()));
        
        sc2.addItem(laptop); //weight 9
        sc2.addItem(toothbrush); //weight 1

        sc3.addItem(sweater); //weight 3
        sc3.addItem(shoes); //weight 5

        //Creating hold
        Hold hold = new Hold(25);
        hold.addSuitcase(sc1);
        hold.addSuitcase(sc2);
        hold.addSuitcase(sc3);

        //Testing the program
        
        int holdWeight = hold.totalWeight();
        System.out.println("Hold weight: " + holdWeight);

        System.out.println("sc1 items: ");
        sc1.printItems();
        System.out.println();

        System.out.println("sc1 total weight: " + sc1.totalWeight());

        System.out.println();
        System.out.println("All items in hold: ");
        hold.printItems();
    }

}
