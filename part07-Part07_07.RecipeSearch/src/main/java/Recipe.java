import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe (String newName, int newTime, ArrayList<String> newIngredients) {
        this.name = newName;
        this.cookingTime = newTime;
        this.ingredients = newIngredients;
    }

    public String getName () {
        return name;
    }

    public int getCookingTime () {
        return cookingTime;
    }

    public ArrayList<String> getIngredients () {
        return ingredients;
    }
}
