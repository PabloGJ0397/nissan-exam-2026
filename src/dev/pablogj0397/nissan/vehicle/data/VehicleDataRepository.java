package dev.pablogj0397.nissan.vehicle.data;

import dev.pablogj0397.nissan.vehicle.domain.Vehicle;
import dev.pablogj0397.nissan.vehicle.domain.VehicleRepository;

import java.util.ArrayList;

public class VehicleDataRepository implements VehicleRepository {
    private VehicleMemLocalDataSource vehicleMemLocalDataSource;

    public VehicleDataRepository(VehicleMemLocalDataSource vehicleMemLocalDataSource) {
        this.vehicleMemLocalDataSource = vehicleMemLocalDataSource;
    }

    @Override
    public ArrayList<Vehicle> findAll(){
        return vehicleMemLocalDataSource.findAll();
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleMemLocalDataSource.save(vehicle);
    }

    @Override
    public void deleteVehicle(String vehicleId) {
        vehicleMemLocalDataSource.delete(vehicleId);

    }
}
