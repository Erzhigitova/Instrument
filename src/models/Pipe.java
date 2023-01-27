package models;

import interfaces.Instrument;

public class Pipe implements Instrument {

    private double diameter;

    public Pipe() {
    }

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter + " мм.");
    }
}
