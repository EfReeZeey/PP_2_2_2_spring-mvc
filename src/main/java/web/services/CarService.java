package web.services;

import web.models.Car;

import java.util.List;

public interface CarService {
    void addCar(String manufacturer, String model);
    List<Car> GetSomeCars(int count);
}
