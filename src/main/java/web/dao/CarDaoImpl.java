package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    private int CAR_COUNTER;

    public CarDaoImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Fiesta"));
        this.cars.add(new Car(++CAR_COUNTER, "BMW", "E46"));
        this.cars.add(new Car(++CAR_COUNTER, "Toyota", "Celica"));
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Focus"));
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Mustang"));
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
