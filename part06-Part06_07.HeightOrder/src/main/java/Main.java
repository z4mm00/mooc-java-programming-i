
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Is the room empty? " + room.isEmpty());
        Person sam = new Person("Sam", 180);
        Person kiki = new Person("Kiki", 172);
        Person isaac = new Person("Isaac", 185);
        Person pokemon = new Person("Pikachu" , 90);
        Person insect = new Person("Bug", 15);
        room.add(sam);
        room.add(kiki);
        room.add(isaac);
        room.add(pokemon);
        room.add(insect);
        System.out.println("Is the room empty? " + room.isEmpty());
        System.out.println("");
        System.out.println("The persons in the room are:");
        for(Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println("The shortest person is: " + room.shortest());
        System.out.println("");
        System.out.println("Removing the shortest now: " + room.take());
        for(Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println("Removing the shortest now: " + room.take());
        for(Person person : room.getPersons()) {
            System.out.println(person);
        }


    }
}
