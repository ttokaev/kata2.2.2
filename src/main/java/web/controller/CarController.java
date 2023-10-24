package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.Collections;
import java.util.List;

@Controller
public class CarController {

    CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = Collections.nCopies(5, new Car("egor", "bmw", "a123bc"));
        model.addAttribute("cars", service.getNumCars(cars, count));
        return "cars";
    }
}
