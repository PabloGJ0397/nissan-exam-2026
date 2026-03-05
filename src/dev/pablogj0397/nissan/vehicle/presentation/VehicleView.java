package dev.pablogj0397.nissan.vehicle.presentation;

import dev.pablogj0397.nissan.vehicle.data.VehicleDataRepository;
import dev.pablogj0397.nissan.vehicle.data.VehicleMemLocalDataSource;
import dev.pablogj0397.nissan.vehicle.domain.GetVehiclesUseCase;
import dev.pablogj0397.nissan.vehicle.domain.Vehicle;

import java.util.ArrayList;

public class VehicleView {
    public static void findAll(){
        GetVehiclesUseCase getVehiclesUseCase = new GetVehiclesUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.getInstance()));
        ArrayList<Vehicle> vehicles = getVehiclesUseCase.execute();
        System.out.println(vehicles);
    }
}
