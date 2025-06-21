/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<LicensePlate, String>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.vehicles.containsKey(licensePlate))) {
            this.vehicles.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate plate : this.vehicles.keySet()) {
            if (plate.equals(licensePlate)) {
                return this.vehicles.get(plate);
            }
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicles.containsKey(licensePlate)) {
            this.vehicles.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.vehicles.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedNames = new ArrayList<>();
        for (LicensePlate plate : this.vehicles.keySet()) {
            String name = this.vehicles.get(plate);
            if (!printedNames.contains(name)) {
                System.out.println(name);
                printedNames.add(name);
            }
        }
    }
}
