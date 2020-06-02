package cat.udl.ampli.composite.observer.hierarchy;

import java.util.Observable;

public abstract class MachineComponent extends Observable {

    protected boolean broken = false;

    public void setBroken() {
        if (!isBroken()) {
            broken = true;
            setChanged();
            notifyObservers(true);
        }
    }

    public void repair() {
        if (isBroken()) {
            broken = false;
            setChanged();
            notifyObservers(false);
        }
    }

    public abstract boolean isBroken();
}
