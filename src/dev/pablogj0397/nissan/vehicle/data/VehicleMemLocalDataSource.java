package dev.pablogj0397.nissan.vehicle.data;

import dev.pablogj0397.nissan.vehicle.domain.Vehicle;

import java.util.ArrayList;
import java.util.Objects;

public class VehicleMemLocalDataSource {
    private static VehicleMemLocalDataSource instance;

    private ArrayList<Vehicle> storage = new ArrayList<>();

    private VehicleMemLocalDataSource(){initData();}

    public void initData(){

    }

    public static VehicleMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new VehicleMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Vehicle> findAll() {
        return storage;
    }

    public void save(Vehicle vehicle) {
        storage.add(vehicle);
    }

    public void delete(String vehicleId) {
        storage.removeIf(vehicle -> Objects.equals(vehicle.getId(), vehicleId));
    }
}
