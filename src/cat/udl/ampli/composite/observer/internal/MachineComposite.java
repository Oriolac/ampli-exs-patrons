package cat.udl.ampli.composite.observer.internal;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class MachineComposite extends MachineComponent implements Observer {

    private Set<MachineComponent> mcs;
    private MachineObservable obs;
    private int count;

    private static class MachineObservable extends Observable {
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }

        @Override
        protected synchronized void clearChanged() {
            super.clearChanged();
        }
    }

    public MachineComposite(long id) {
        super(id);
        mcs = new HashSet<>();
        obs = new MachineObservable();
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void addComponent(MachineComponent mc) {
        mcs.add(mc);
        if (mc instanceof MachineComposite) {
            count += ((MachineComposite) mc).getCount();
        } else {
            count++;
        }
        obs.setChanged();
        obs.notifyObservers();
    }

    @Override
    public void update(Observable o, Object arg) {
        count = 0;
        for (MachineComponent mc : mcs) {
            if (mc instanceof MachineComposite)
                count += ((MachineComposite) mc).getCount();
            else
                count += 1;
        }
    }
}
