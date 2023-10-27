package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Collections;
import java.util.List;

@Repository
public class CarDAO {

    public List<Car> getCars() {
        return Collections.nCopies(5, new Car("egor", "bmw", "a123bc"));
    }
}
