package dev.pablogj0397.nissan.vehicle.domain;

public class SaveVehicleUseCase {
    private VehicleRepository vehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void execute(Vehicle vehicle){
        vehicleRepository.saveVehicle(vehicle);
    }
}
