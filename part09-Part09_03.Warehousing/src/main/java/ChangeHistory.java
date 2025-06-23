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

public class ChangeHistory {

    private ArrayList<Double> histories;

    public ChangeHistory() {

        this.histories = new ArrayList<Double>();
    }

    public void add(double status) {

        this.histories.add(status);
    }

    public void clear() {
        this.histories.clear();
    }

    public double maxValue() {
        if (this.histories.isEmpty()) {
            return 0;
        }
        double maxValue = this.histories.get(0);
        for (int i = 0; i < this.histories.size(); i++) {
            if (this.histories.get(i) > maxValue) {
                maxValue = this.histories.get(i);
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.histories.isEmpty()) {
            return 0;
        }
        double minValue = this.histories.get(0);
        for (int i = 0; i < this.histories.size(); i++) {
            if (this.histories.get(i) < minValue) {
                minValue = this.histories.get(i);
            }
        }
        return minValue;
    }

    public double average() {
        double total = 0.0;
        for (Double history : this.histories) {
            total += history;
        }
        return total / this.histories.size();
    }

    @Override
    public String toString() {
        return this.histories.toString();
    }
}
