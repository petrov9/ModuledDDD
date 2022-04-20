package org.example.app_service.port.driving.impl;

import org.example.app_service.port.driven.ICarRepository;
import org.example.app_service.port.driving.ICarService;
import org.example.domain.model.Car;
import org.example.domain.model.Driver;
import org.example.domain.service.CarDriverService;


public class CarService implements ICarService {


    private ICarRepository carRepository;

    private CarDriverService carDriverService;

    @Override
    public Car putDriverInAnyCar(Driver driver) {
        Car car = carRepository.findFreeCar();
        carDriverService.sitDriverInTheCar(driver, car);

        carRepository.save(car);

        return car;
    }
}
