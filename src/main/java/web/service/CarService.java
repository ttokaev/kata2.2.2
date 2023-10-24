package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getNumCars(List<Car> cars, int num) {
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}
