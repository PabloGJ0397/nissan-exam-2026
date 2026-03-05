package dev.pablogj0397.nissan.vehicle;

import dev.pablogj0397.nissan.vehicle.presentation.VehicleView;

public class MainVehicles {
    public static void main(String[] args) {
        //TEST FEATURE GetVehicles = findAll
        // VehicleView.findAll();

        //TEST FEATURE SaveVehicles
        VehicleView.findAll();
        VehicleView.saveVehicle();
        VehicleView.findAll();
    }
}
