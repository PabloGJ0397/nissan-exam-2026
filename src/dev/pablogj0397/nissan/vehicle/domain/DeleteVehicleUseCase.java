package dev.pablogj0397.nissan.vehicle.domain;

public class DeleteVehicleUseCase {
    private VehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void execute(String vehicleId){
        vehicleRepository.deleteVehicle(vehicleId);
    }
}
