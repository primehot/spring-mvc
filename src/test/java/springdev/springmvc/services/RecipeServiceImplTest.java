package springdev.springmvc.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import springdev.springmvc.domain.Recipe;
import springdev.springmvc.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by oleht on 20.01.2018
 */
public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(this.recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception {
        Recipe r = new Recipe();
        Set<Recipe> s = new HashSet();
        s.add(r);

        when(recipeService.getRecipes()).thenReturn(s);

        assertEquals(1, recipeService.getRecipes().size());
        verify(recipeRepository, times(1)).findAll();
    }

}