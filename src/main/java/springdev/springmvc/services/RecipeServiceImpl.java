package springdev.springmvc.services;

import org.springframework.stereotype.Service;
import springdev.springmvc.domain.Recipe;
import springdev.springmvc.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oleht on 14.01.2018
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
