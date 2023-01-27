package models;

import interfaces.Instrument;

public class Guitar implements Instrument {

    private int numsStrings;

    public Guitar() {

    }

    public Guitar(int numsStrings) {
        this.numsStrings = numsStrings;
    }

    public int getNumsStrings() {
        return numsStrings;
    }

    public void setNumsStrings(int numsStrings) {
        this.numsStrings = numsStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара c " + numsStrings + " струнами.");
    }
}
