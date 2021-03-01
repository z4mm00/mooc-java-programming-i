import java.util.ArrayList;

public class BirdRegistry {

    private ArrayList<Bird> birdsDatabase;

    public BirdRegistry () {
        this.birdsDatabase = new ArrayList<>();
    }

    public void add (Bird newBird) {
        birdsDatabase.add(newBird);
    }

    public boolean observation (String editBird) {
        for (Bird bird : birdsDatabase) {
            if (bird.getName().equals(editBird)) {
                bird.addObservation();
                return true;
            }
        }
        return false;
    }

    public void getBirdsDatabase() {
        for (Bird bird : birdsDatabase) {
            System.out.println(bird);
        }
    }

    public Bird getOneBird(String birdName) {
        Bird theOne = new Bird("new", "new");
        for (Bird bird : birdsDatabase) {
            if (bird.getName().equals(birdName)) {
                theOne = bird;
            }
        }
        return theOne;
    }
}
