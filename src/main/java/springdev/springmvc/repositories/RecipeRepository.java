package springdev.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import springdev.springmvc.domain.Recipe;

/**
 * Created by oleh.tsyupaon 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
