package models;

import interfaces.Instrument;

public class Drum implements Instrument {

    private double size;

    public Drum() {
    }

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play(){
        System.out.println("Играет барабан с размером "+size +" м2.");

    }

}
