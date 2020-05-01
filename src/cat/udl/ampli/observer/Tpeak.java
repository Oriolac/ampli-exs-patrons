package cat.udl.ampli.observer;

import java.util.Observable;

public class Tpeak extends Observable {

    private double value;

    public Tpeak(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }
}
