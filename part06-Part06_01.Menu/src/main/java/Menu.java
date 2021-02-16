
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        meals = new ArrayList<>();
    }

    // Adding a meal to our menu list
    public void addMeal(String meal) {
        if(!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for(String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }

}
