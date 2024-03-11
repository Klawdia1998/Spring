package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiseImp implements CarService{

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 5, "black"));
        carList.add(new Car("AUDI", 7, "white"));
        carList.add(new Car("VOLVO", 3, "gray"));
        carList.add(new Car("LEXUS", 9, "blue"));
        carList.add(new Car("PORSCHE", 8, "red"));

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
