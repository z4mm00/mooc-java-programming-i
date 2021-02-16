
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item computer = new Item("Computer", 5);
        System.out.println("The item is: " + computer);
        Item phone = new Item("Phone", 2);
        System.out.println("The item 2 is: " + phone);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(computer);
        suitcase.addItem(phone);
        suitcase.addItem(new Item("Book", 3));
        System.out.println("The items in the suitcase are:");
        suitcase.printItems();
        System.out.println("Total weight is: " + suitcase.totalWeight() + " kg");
        System.out.println("Heaviest item: " + suitcase.heaviestItem());
        Hold hold = new Hold(30);
        hold.addSuitcase(suitcase);
        System.out.println("The hold now has: " + hold);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();



    }

}
