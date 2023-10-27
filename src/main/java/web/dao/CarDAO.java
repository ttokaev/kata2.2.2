package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    public List<Car> createCarList(int num) {
        return Collections.nCopies(num, new Car("egor", "bmw", "a123bc"));
    }

    public List<Car> getNumCars(List<Car> cars, int num) {
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}
