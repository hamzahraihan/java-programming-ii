/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packables;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<Packable>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.maximumCapacity) {
            this.packables.add(packable);
        }
    }

    public double totalWeight() {
        double totalWeight = 0;
        for (Packable packable : this.packables) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    @Override
    public double weight() {
        return this.totalWeight();
    }

    @Override
    public String toString() {
        return "Box: " + this.packables.size() + " items, " + "total weight " + this.weight() + " kg";
    }

}
