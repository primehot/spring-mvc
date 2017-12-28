package springdev.springmvc.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springdev.springmvc.domain.Category;
import springdev.springmvc.domain.UnitOfMeasure;
import springdev.springmvc.repositories.CategoryRepository;
import springdev.springmvc.repositories.UnitOfMeasureRepository;

import java.util.Optional;

/**
 * Created by oleht on 20.12.2017
 */
@Controller
@Slf4j
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {
        log.debug("getIndexPage request");

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + category.get().getId());
        System.out.println("Unit id is: " + unit.get().getId());

        return "index";
    }
}
