package springdev.springmvc.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by oleht on 27.12.2017
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
