import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe){
        if (recipes.contains(recipe)){
            throw new ProductExistExeption("Рецепт уже добавлен");
        }
        recipes.add(recipe);
    }


    public void removeRecipe(Recipe recipe){
        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Recipes: \n" + recipes;
    }
}
