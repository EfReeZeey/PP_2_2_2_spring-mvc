package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void addCar(String manufacturer, String model);
    List<Car> getAllCars();
}
