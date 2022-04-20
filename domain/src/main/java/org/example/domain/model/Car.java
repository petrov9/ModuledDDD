package org.example.domain.model;

import org.example.domain.vo.CarNumber;

public class Car {

    private CarNumber carNumber;
    private Driver driver;

    public Car(CarNumber carNumber, Driver driver) {
        setCarNumber(carNumber);
        setDriver(driver);
    }

    public Driver driver() {
        return driver;
    }

    public boolean hasDriver() {
        return driver != null;
    }

    public void sitDriver(Driver driver) {
        setDriver(driver);
    }

    private void setCarNumber(CarNumber carNumber) {
        this.carNumber = carNumber;
    }

    private void setDriver(Driver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver can't be null");
        }

        this.driver = driver;
    }
}
