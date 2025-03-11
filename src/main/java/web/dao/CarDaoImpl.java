package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    private int CAR_COUNTER;

    public CarDaoImpl() {
        this.cars = new ArrayList<>();
        this.addCar("Ford", "Fiesta");
        this.addCar("BMW", "E46");
        this.addCar("Toyota", "Celica");
        this.addCar("Ford", "Focus");
        this.addCar("Ford", "Mustang");
    }

    public void addCar(String manufacturer, String model) {
        cars.add(new Car(CAR_COUNTER++, manufacturer, model));
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
