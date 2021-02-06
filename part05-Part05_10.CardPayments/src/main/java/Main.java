import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
//        PaymentCard mastercard = new PaymentCard(500);
//        System.out.println("Balance: " + mastercard.balance());
//        boolean wasApproved = mastercard.takeMoney(46.5);
//        System.out.println("Your charge Approved: " + wasApproved);
//        System.out.println("Balance: " + mastercard.balance());
//        mastercard.addMoney(100);
//        System.out.println("Balance: " + mastercard.balance());
//        wasApproved = mastercard.takeMoney(500);
//        System.out.println("Your charge Approved: " + wasApproved);
//        System.out.println("Balance: " + mastercard.balance());
//        wasApproved = mastercard.takeMoney(50);
//        System.out.println("Your charge Approved: " + wasApproved);
//        System.out.println("Balance: " + mastercard.balance());
//        wasApproved = mastercard.takeMoney(5);
//        System.out.println("Your charge Approved: " + wasApproved);
//        System.out.println("Balance: " + mastercard.balance());

//        PaymentTerminal cashierBox = new PaymentTerminal();
//        PaymentCard giftCard = new PaymentCard(7);
//        System.out.println(cashierBox);
//        double change = cashierBox.eatAffordably(10);
//        System.out.println("Your change is: " + change);
//        change = cashierBox.eatAffordably(5);
//        System.out.println("Your change is: " + change);
//        change = cashierBox.eatHeartily(4.3);
//        System.out.println("Your change is: " + change);
//        System.out.println(cashierBox);
//        boolean cardApproved = cashierBox.eatAffordably(giftCard);
//        System.out.println("Your card was approved: " +cardApproved);
//        System.out.println("Card balance: " + giftCard.balance());
//        System.out.println(cashierBox);

//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum);
//
//        PaymentCard annesCard = new PaymentCard(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);

        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(10);
        terminal.addMoneyToCard(card, -10);
        System.out.println(card.balance());
    }
}
//        PaymentTerminal cashierBox = new PaymentTerminal();
//        PaymentCard card = new PaymentCard(50);
//        double total = 0.0;
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("");
//            System.out.println("WELCOME TO BARRY'S CAFETERIA");
//            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
//            System.out.println("MENU:");
//            System.out.println("Affordable Meal.......$2.50");
//            System.out.println("Hearty Meal...........$4.30");
//            System.out.println("");
//            System.out.println("Your payment will be with: <Cash> or <Card> ?");
//            String response = scanner.nextLine();
//            if(response.equals("cash")) {
//                System.out.println("Thank you, what meal would you like to buy? <Exit> to quit.");
//                response = scanner.nextLine();
//                if(response.equals("affordable")) {
//                    total+= 2.50;
//                    System.out.println("Your Total is: $" + total + " usd");
//                    System.out.println("Enter your payment amount: ");
//                    double amountToPay = Integer.valueOf(scanner.nextLine());
//                    double change = cashierBox.eatAffordably(amountToPay);
//                    System.out.println("Your change is: " + change);
//                }
//                if(response.equals("hearty")) {
//                    total+= 4.30;
//                    System.out.println("Your Total is: $" + total + " usd");
//                    System.out.println("Enter your payment amount: ");
//                    double amountToPay = Integer.valueOf(scanner.nextLine());
//                    double change = cashierBox.eatAffordably(amountToPay);
//                    System.out.println("Your change is: " + change);
//                }
//            }
//            if(response.equals("card")) {
//                System.out.println("Thank you, what meal would you like to buy? <Exit> to quit.");
//                response = scanner.nextLine();
//                if(response.equals("affordable")) {
//                    total+= 2.50;
//                    System.out.println("Your Total is: $" + total + " usd");
//                    boolean cardApproved = cashierBox.eatAffordably(card);
//                    if(cardApproved) {
//                        System.out.println("Your card was approved" );
//                    } else {
//                        System.out.println("Your card was Denied, not enough funds." );
//                    }
//                }
//                if(response.equals("hearty")) {
//                    total+= 4.30;
//                    System.out.println("Your Total is: $" + total + " usd");
//                    boolean cardApproved = cashierBox.eatHeartily(card);
//                    if(cardApproved) {
//                        System.out.println("Your card was approved" );
//                    } else {
//                        System.out.println("Your card was Denied, not enough funds." );
//                    }
//                }
//            }
//        }
//    }


