package springdev.springmvc.services;


import springdev.springmvc.commands.RecipeCommand;
import springdev.springmvc.domain.Recipe;

import java.util.Set;

/**
 * Created by oleht on 22.01.2018
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
