package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private int CAR_COUNTER;
    private List<Car> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Fiesta"));
        this.cars.add(new Car(++CAR_COUNTER, "BMW", "E46"));
        this.cars.add(new Car(++CAR_COUNTER, "Toyota", "Celica"));
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Focus"));
        this.cars.add(new Car(++CAR_COUNTER, "Ford", "Mustang"));
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
