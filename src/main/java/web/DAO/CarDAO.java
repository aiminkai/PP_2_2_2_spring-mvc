package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDAO {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("VW", "brown", "gasoline"));
        cars.add(new Car("ford", "black", "gasoline"));
        cars.add(new Car("mazda", "blue", "diesel"));
        cars.add(new Car("volvo", "white", "diesel"));
        cars.add(new Car("seat", "red", "gasoline"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
