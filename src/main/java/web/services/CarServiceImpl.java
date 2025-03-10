package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    public CarServiceImpl() {}

    @Override
    public void addCar(String manufacturer, String model) {
        carDao.addCar(manufacturer, model);
    }

    @Override
    public List<Car> GetSomeCars(int count) {
        if (count >= 5) return carDao.getAllCars();
        return carDao.getAllCars().subList(0, count);
    }
}
