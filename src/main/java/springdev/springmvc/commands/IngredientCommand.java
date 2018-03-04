package springdev.springmvc.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springdev.springmvc.commands.UnitOfMeasureCommand;

import java.math.BigDecimal;

/**
 * Created by oleht on 12.02.2018
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;

}