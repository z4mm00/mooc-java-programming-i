import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> manager;

    public JokeManager() {
        this.manager = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.manager.add(joke);
    }

    public String drawJoke() {
        if (manager.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        String joke = manager.get(draw.nextInt(manager.size()));
        return joke;
    }

    public void printJokes() {
        for(String joke : manager) {
            System.out.println(joke);
        }
    }


}
