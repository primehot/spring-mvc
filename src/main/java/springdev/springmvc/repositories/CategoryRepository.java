package springdev.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import springdev.springmvc.domain.Category;

import java.util.Optional;

/**
 * Created by oleh.tsyupaon 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
