package springdev.springmvc.services;

import springdev.springmvc.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by oleh.tsyupaon 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
