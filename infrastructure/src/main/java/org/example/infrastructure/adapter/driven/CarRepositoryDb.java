package org.example.infrastructure.adapter.driven;

import java.util.List;
import org.example.app_service.port.driven.ICarRepository;
import org.example.domain.model.Car;
import org.example.domain.vo.CarNumber;

public class CarRepositoryDb implements ICarRepository {


    @Override
    public Car findById(CarNumber carId) {
        return null;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public Car findFreeCar() {
        return null;
    }

    @Override
    public Car save(Car car) {
        return null;
    }
}
