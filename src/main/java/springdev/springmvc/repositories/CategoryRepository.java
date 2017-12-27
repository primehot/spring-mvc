package springdev.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import springdev.springmvc.domain.Category;

import java.util.Optional;

/**
 * Created by oleht on 27.12.2017
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
