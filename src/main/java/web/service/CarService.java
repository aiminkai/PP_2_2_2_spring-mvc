package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("VW", "brown", "gasoline"));
        cars.add(new Car("ford", "black", "gasoline"));
        cars.add(new Car("mazda", "blue", "diesel"));
        cars.add(new Car("volvo", "white", "diesel"));
        cars.add(new Car("seat", "red", "gasoline"));
    }


    public List <Car> getCars(int size) {
        List <Car> showCars = new ArrayList<>();
        if (size >= 5) {
            showCars = cars;
        } else if (size > 0 & size < 5) {
            for (int i = 0; i < size; i++) {
                showCars.add(cars.get(i));
            }
        }
        return showCars;
    }

}
