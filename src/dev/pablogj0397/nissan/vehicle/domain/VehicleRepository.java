package dev.pablogj0397.nissan.vehicle.domain;

import java.util.ArrayList;

public interface VehicleRepository {
    public ArrayList<Vehicle> findAll();
    public void saveVehicle(Vehicle vehicle);
    public void deleteVehicle(String vehicleId);
}
