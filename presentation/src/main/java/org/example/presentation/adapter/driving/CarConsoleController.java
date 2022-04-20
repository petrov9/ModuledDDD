package org.example.presentation.adapter.driving;


import org.example.app_service.port.driving.ICarService;

public class CarConsoleController {

    private ICarService carService;

    public void getAll() {
        System.out.println(carService.getAll());
    }
}
