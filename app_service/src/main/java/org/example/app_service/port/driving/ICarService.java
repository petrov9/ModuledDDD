package org.example.app_service.port.driving;

import java.util.List;
import org.example.domain.model.Car;
import org.example.domain.model.Driver;

public interface ICarService {

    Car putDriverInAnyCar(Driver driver);
}
