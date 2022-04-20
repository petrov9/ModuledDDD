package org.example.domain.model;

public class Driver {

    private int age;
    private Car car;

    public Driver(int age) {
        setAge(age);
    }

    public boolean isInAnyCar() {
        return car != null;
    }

    public void sitInCar(Car car) {
        setCar(car);
    }

    public int age() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setCar(Car car) {
        this.car = car;
        car.sitDriver(this);
    }
}
