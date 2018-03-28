package springdev.springmvc.services;

import springdev.springmvc.commands.IngredientCommand;

/**
 * Created by oleh.tsyupaon 6/27/17.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
