package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarServiseImp;

import java.util.List;

@Controller
public class CarController {

    private final CarServiseImp carServiseImp;

    public CarController(CarServiseImp carServiseImp) {
        this.carServiseImp = carServiseImp;
    }

    @GetMapping({"/cars"})
    public String showCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                           Integer count, Model model) {
        List<Car> carList = carServiseImp.carList(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
