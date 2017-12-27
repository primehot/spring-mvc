package springdev.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import springdev.springmvc.domain.Recipe;

/**
 * Created by oleht on 27.12.2017
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
