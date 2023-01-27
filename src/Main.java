import interfaces.Instrument;
import models.*;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(5);
        Drum drum = new Drum(0.29);
        Pipe pipe = new Pipe(14);

        Instrument[] instruments = new Instrument[]{guitar, drum, pipe};

        for (Instrument i : instruments) {
            i.play();
        }

    }
}