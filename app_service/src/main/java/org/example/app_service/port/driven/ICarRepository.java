package org.example.app_service.port.driven;

import java.util.List;
import org.example.domain.model.Car;
import org.example.domain.vo.CarNumber;

public interface ICarRepository {

    Car findById(CarNumber carId);
    List<Car> findAll();
    Car findFreeCar();
    Car save(Car car);
}
