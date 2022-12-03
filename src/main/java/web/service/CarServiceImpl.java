package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("VW", "brown", "gasoline"));
        cars.add(new Car("ford", "black", "gasoline"));
        cars.add(new Car("mazda", "blue", "diesel"));
        cars.add(new Car("volvo", "white", "diesel"));
        cars.add(new Car("seat", "red", "gasoline"));
    }

    @Override
    public List<Car> getCars(int size) {

        return cars.stream().limit(size).toList();
    }

}
