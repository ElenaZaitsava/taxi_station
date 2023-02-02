package by.car.taxi_station.service;

import java.sql.Driver;
import java.util.List;
import java.util.Optional;

public interface AbstractDriverService {

    Optional<Driver> getDriver(Driver driver);

    List<Driver> findDriverByName(String name);

    List<Driver> getAllDrivers();

    void saveDriver(Driver driver);

    void deleteDriver(Driver driver);

    int numberOfDrivers();
}
