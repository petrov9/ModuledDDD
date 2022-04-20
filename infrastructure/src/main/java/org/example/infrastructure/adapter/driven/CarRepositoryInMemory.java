package org.example.infrastructure.adapter.driven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.app_service.port.driven.ICarRepository;
import org.example.domain.model.Car;
import org.example.domain.vo.CarNumber;

public class CarRepositoryInMemory implements ICarRepository {

    private static final Map<CarNumber, CarDAO> storage = new HashMap<>();


    @Override
    public Car findById(CarNumber carNumber) {
        CarDAO carDAO = storage.get(carNumber);

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
