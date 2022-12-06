package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDaoInterface {
    public List<Car> getCars();
    public void setCars(List<Car> cars);

}
