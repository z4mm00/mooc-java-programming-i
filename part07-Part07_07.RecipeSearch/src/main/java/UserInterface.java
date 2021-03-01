import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface (Scanner scanner) {
        this.scanner = scanner;
    }

    public void start () {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        ArrayList<Recipe> recipes = createRecipes(fileName);
        System.out.println("");
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                }
                System.out.println("");
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(search)) {
                        System.out.println("Recipes:");
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                        System.out.println("");
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
                System.out.println("");
            }

            if (command.equals("find ingredient")) {
                ArrayList<String> ingredients = new ArrayList<>();
                System.out.print("Ingredient: ");
                String ingredientToFind = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredientToFind)) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
                System.out.println("");
            }
        }
    }



    public static ArrayList<Recipe> createRecipes (String fileName) {
        String recipeName = "";
        int recipeCookingTime = 0;
        String ingredient = "";
        boolean recipeDone = false;
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                ArrayList<String> recipeIngredients = new ArrayList<>();
                recipeName = scanner.nextLine();
                recipeCookingTime = Integer.valueOf(scanner.nextLine());
                recipeDone = false;
                while (!recipeDone) {  // Check to validate if the recipe has been created and added to ArrayList
                    ingredient = scanner.nextLine(); // Reading each ingredient from the txt file.
                    if (ingredient.isEmpty() || !scanner.hasNextLine()) { // When identifying an empty space separator between recipes.
                        recipes.add(new Recipe(recipeName, recipeCookingTime, recipeIngredients));
                        recipeDone = true;
                        continue;
                    }
                    recipeIngredients.add(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error with file: " + e.getMessage());
        }
        return recipes;
    }
}
