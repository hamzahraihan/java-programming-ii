/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.List;
import java.util.ArrayList;

public class Pipe<T> {

    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<T>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        T taken = this.pipe.get(0);
        this.pipe.remove(0);
        return taken;
    }

    public boolean isInPipe() {
        return this.pipe.size() > 0;
    }
}
