package springdev.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import springdev.springmvc.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by oleh.tsyupaon 6/13/17.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
