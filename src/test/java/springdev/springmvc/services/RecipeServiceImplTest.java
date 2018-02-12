package springdev.springmvc.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import springdev.springmvc.domain.Recipe;
import springdev.springmvc.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created by oleht on 20.01.2018
 */
public class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(this.recipeRepository);
    }

    @Test
    public void getRecipesById() {
        Recipe r = new Recipe();
        Optional<Recipe> o = Optional.of(r);

        when(recipeRepository.findById(anyLong())).thenReturn(o);
        Recipe result = recipeService.getRecipeById(1l);
        assertNotNull(result);
        verify(recipeRepository, times(1)).findById(1l);
        verify(recipeRepository, never()).findAll();
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