package application;

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

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList();
        this.readings = new ArrayList();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        double averageRead = this.sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .orElseThrow(() -> new IllegalStateException("AverageSensor is off, or if no sensors have been added to it"));
        this.readings.add((int) averageRead);
        return (int) averageRead;
    }

}
