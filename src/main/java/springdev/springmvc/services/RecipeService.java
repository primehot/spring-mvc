package springdev.springmvc.services;

import springdev.springmvc.domain.Recipe;

import java.util.Set;

/**
 * Created by oleht on 14.01.2018
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
