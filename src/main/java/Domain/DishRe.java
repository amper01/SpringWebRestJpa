package Domain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRe extends CrudRepository<Dish,Integer>{
    List<Dish> findByNazwa(String nazwa);
    List<Dish> findByCenaLessThan(Integer ileMamyPieniedzy);
    List<Dish> findByCenaGreaterThan(Integer ileChceWydac);


}
