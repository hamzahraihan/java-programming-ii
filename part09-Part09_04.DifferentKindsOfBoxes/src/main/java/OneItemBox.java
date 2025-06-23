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

public class OneItemBox extends Box {

    private ArrayList<Item> item;

    public OneItemBox() {
        this.item = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        if (this.item.size() < 1) {
            this.item.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : this.item) {
            if (i.getName().contains(item.getName())) {
                return true;
            }
        }
        return false;
    }

}
