import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if(room.size() == 0 ) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        if(room.isEmpty()) {
            return null;
        }
        Person shortestPerson = room.get(0);
        for(Person person : room) {
            if(shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
        return  shortestPerson;
    }

    public Person take() {
        if(room.isEmpty()){
            return null;
        }
        Person shortestPerson = this.shortest();
        room.remove(shortestPerson);
        return shortestPerson;
    }
}
