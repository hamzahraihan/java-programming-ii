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

public class IOU {

    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String string) {
        return this.iou.getOrDefault(string, 0.0);
    }

}
