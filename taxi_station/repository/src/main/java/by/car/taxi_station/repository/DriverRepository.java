package by.car.taxi_station.repository;

import by.car.taxi_station.model.Driver;

import java.util.List;


public class DriverRepository implements AbstractDriverRepository {

    private List<Driver> driversList;

    public DriverRepository(List<Driver> driversList) {
        this.driversList = driversList;
    }

    @Override
    public Driver getDriver(Driver driver) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Driver> findDriversByName(String name) {
        return null;
    }

    @Override
    public List<Driver> getAllDriver() {
        return null;
    }

    @Override
    public void saveDriver(Driver driver) {

    }

    @Override
    public void deleteDriver(Driver driver) {

    }
}
