/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
public class Container {

    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        int amountToAdd = Math.min(this.value + amount, 100);
        this.value = amountToAdd;
    }

    public void remove(int amount) {
        int amountToRemove = Math.min(amount, this.value);
        this.value -= amountToRemove;
    }

    @Override
    public String toString() {
        return this.contains() + "/100";
    }
}
