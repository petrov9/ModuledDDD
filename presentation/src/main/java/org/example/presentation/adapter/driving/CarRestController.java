package org.example.presentation.adapter.driving;

import java.util.List;
import org.example.app_service.port.driving.ICarService;
import org.example.domain.model.Car;

public class CarRestController {

    private ICarService carService;

    public List<Car> getAll() {
        return carService.getAll();
    }
}
