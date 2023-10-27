package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> createCarList(int num) {
        return carDAO.createCarList(num);
    }

    public List<Car> getNumCars(List<Car> cars, int num) {
        return carDAO.getNumCars(cars, num);
    }
}
