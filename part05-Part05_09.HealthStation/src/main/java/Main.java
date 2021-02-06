
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation hospital = new HealthStation();
        Person sam = new Person("Sam", 35, 180, 89);
        System.out.println(sam.getName() + "'s weight: " + hospital.weigh(sam) +" kilos");
        hospital.feed(sam);
        System.out.println(sam.getName() + "'s weight: " + hospital.weigh(sam) +" kilos");
        System.out.println("weighings performed: " + hospital.weighings());
    }

}
