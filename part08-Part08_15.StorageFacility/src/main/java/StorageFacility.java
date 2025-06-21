/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<String, ArrayList<String>>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        if (!(this.storage.containsKey(storageUnit))) {
            return;
        }
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<String>();
        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
