package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getNumCars(int num) {
        return carDAO.getCars().stream().limit(num).collect(Collectors.toList());
    }
}
