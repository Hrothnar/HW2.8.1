import java.util.*;

public class Recipe {
    private String recipeName;
    private int costOfRecipe;
    private Set<Product> recipe = new HashSet<>();
    public static Set<Recipe> allRecipes = new HashSet<>();


    public Recipe(String recipeName) {
        if (recipeName != null && !recipeName.isBlank())
            this.recipeName = recipeName;
//        if (recipe.size() != 0)
//            this.recipe = recipe;
    }

    public int getCostOfRecipe() {
        int result = 0;
        for (Product one : recipe) {
            if (one.getCost() > 0)
                result += one.getCost();
            else
                throw new RuntimeException("Укажите стоимость продукта " + one.getType());
        }
        return result;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getRecipe() {
        return recipe;
    }

    public static Set<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public static void addRecipeToCookbook(Recipe anotherOne) {
        if (!allRecipes.contains(anotherOne))
            allRecipes.add(anotherOne);
        else
            throw new RuntimeException("Такой рецепт присутствует");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe1 = (Recipe) o;
        return costOfRecipe == recipe1.costOfRecipe && Objects.equals(recipeName, recipe1.recipeName) && Objects.equals(recipe, recipe1.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, costOfRecipe, recipe);
    }
}

