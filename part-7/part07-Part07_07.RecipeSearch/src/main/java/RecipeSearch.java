import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        addRecipes(fileName, recipes);
        
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipe by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
                
            if (command.equals("list")) {
                list(recipes);
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searched = scanner.nextLine();
                findName(searched, recipes);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                Integer maxTime = Integer.valueOf(scanner.nextLine());
                findTime(maxTime, recipes);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                findIngredient(ingredient, recipes);               
            }
        }
    }
    
    public static void addRecipes(String fileName, ArrayList<Recipe> recipes) {
        ArrayList<String> recipeParts = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String part = fileScanner.nextLine();
                
                if (part.length() == 0){
                    buildRecipe(recipes, recipeParts);
                    continue;
                }
                
                recipeParts.add(part);
            }
            
            buildRecipe(recipes, recipeParts);
        }
        
        catch (Exception e) {
            System.out.println("Error: File could not be read.");
        }
    }
    
    public static void buildRecipe(ArrayList<Recipe> recipes, ArrayList<String> recipeParts) {
        String name = recipeParts.get(0);
        int duration = Integer.valueOf(recipeParts.get(1));
        recipeParts.remove(0);
        recipeParts.remove(0);
        
        recipes.add(new Recipe(name, duration, recipeParts));
        recipeParts.clear();
    }
    
    public static void list(ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    public static void findName(String name, ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void findTime(int maxTime, ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getDuration() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void findIngredient(String ingredient, ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
        
