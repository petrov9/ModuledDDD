package org.example.domain.service;

import org.example.domain.model.Car;
import org.example.domain.model.Driver;

public class CarDriverService {

    public void sitDriverInTheCar(Driver driver, Car car) {

        if (driver.isInAnyCar()) {
            throw new IllegalStateException("Driver already in a car");
        }

        if (car.hasDriver()) {
            throw new IllegalStateException("Car already has a driver");
        }

        if (driver.age() < 18) {
            throw new IllegalStateException("Driver is under 18");
        } else {
            driver.sitInCar(car);
        }
    }
}
