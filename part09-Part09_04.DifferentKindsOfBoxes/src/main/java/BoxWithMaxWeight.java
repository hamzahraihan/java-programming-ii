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

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {

        if (boxWeight() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : this.items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }

    public int boxWeight() {
        int totalWeight = 0;
        for (Item i : this.items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
}
