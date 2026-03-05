package dev.pablogj0397.nissan.vehicle.domain;

public class GetVehiclesUseCase {
    private VehicleRepository vehicleRepository;

    public GetVehiclesUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void execute(){
        vehicleRepository.findAll();
    }
}
