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

public class Herd implements Movable {

    private List<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<Movable>();
    }

    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : this.herds) {
            herd.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (Movable m : this.herds) {
            text = text + m.toString() + "\n";
        }
        return text;
    }
}
