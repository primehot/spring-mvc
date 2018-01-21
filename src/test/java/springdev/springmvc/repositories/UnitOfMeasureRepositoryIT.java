package springdev.springmvc.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import springdev.springmvc.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by oleht on 21.01.2018
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() throws Exception {

        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unit.get().getDescription());
    }

}