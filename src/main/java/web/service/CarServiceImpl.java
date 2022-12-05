package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {



//    private List<Car> cars = new ArrayList<>();
//
//    {
//        cars.add(new Car("VW", "brown", "gasoline"));
//        cars.add(new Car("ford", "black", "gasoline"));
//        cars.add(new Car("mazda", "blue", "diesel"));
//        cars.add(new Car("volvo", "white", "diesel"));
//        cars.add(new Car("seat", "red", "gasoline"));
//    }

    @Autowired
    private CarDAO carDAO;
    @Override
    public List<Car> getCars(int size) {

        return carDAO.getCars().stream().limit(size).toList();
    }

}
