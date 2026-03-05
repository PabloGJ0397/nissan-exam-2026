package dev.pablogj0397.nissan.vehicle.presentation;

import dev.pablogj0397.nissan.vehicle.data.VehicleDataRepository;
import dev.pablogj0397.nissan.vehicle.data.VehicleMemLocalDataSource;
import dev.pablogj0397.nissan.vehicle.domain.DeleteVehicleUseCase;
import dev.pablogj0397.nissan.vehicle.domain.GetVehiclesUseCase;
import dev.pablogj0397.nissan.vehicle.domain.SaveVehicleUseCase;
import dev.pablogj0397.nissan.vehicle.domain.Vehicle;

import java.util.ArrayList;

public class VehicleView {
    public static void findAll(){
        GetVehiclesUseCase getVehiclesUseCase = new GetVehiclesUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.getInstance()));
        ArrayList<Vehicle> vehicles = getVehiclesUseCase.execute();
        System.out.println(vehicles);
    }
    public static void saveVehicle(){
        Vehicle vehicleTest = new Vehicle("1","Alfa","White","2001", "11.000");
        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.getInstance()));
        saveVehicleUseCase.execute(vehicleTest);
    }

    public static void deleteVehicle(String vehicleId){
        DeleteVehicleUseCase deleteVehicleUseCase = new DeleteVehicleUseCase(new VehicleDataRepository(VehicleMemLocalDataSource.getInstance()));
        deleteVehicleUseCase.execute(vehicleId);
    }
}
