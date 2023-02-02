package by.car.taxi_station.repository;


import by.car.taxi_station.model.Driver;

import java.util.List;

public interface AbstractDriverRepository {
    Driver getDriver (Driver driver) throws EntityNotFoundException;
    List<Driver> findDriversByName(String name);
    List<Driver> getAllDriver();
    void saveDriver(Driver driver);

    void deleteDriver(Driver driver);
}
