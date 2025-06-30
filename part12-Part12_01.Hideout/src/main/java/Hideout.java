/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
public class Hideout<T> {

    private T isHide;

    public Hideout() {
        this.isHide = null;
    }

    public void putIntoHideout(T toHide) {
        this.isHide = toHide;
    }

    public T takeFromHideout() {
        T taken = this.isHide;
        this.isHide = null;
        return taken;
    }

    public boolean isInHideout() {
        return this.isHide != null;
    }
}
