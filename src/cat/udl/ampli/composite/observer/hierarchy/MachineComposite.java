package cat.udl.ampli.composite.observer.hierarchy;

import java.util.*;

public class MachineComposite extends MachineComponent implements Observer {

    private final List<MachineComponent> components = new ArrayList<>();
    private final Set<MachineComponent> brokenComponents = new HashSet<>();

    public void addComponent(MachineComponent mc) {
        components.add(mc);
        mc.addObserver(this);
        if (mc.isBroken()) {
            brokenComponents.add(mc);
            if (!broken && brokenComponents.size() == 1) {
                notifyObservers(isBroken());
            }
        }
    }

    @Override
    public boolean isBroken() {
        if (broken) {
            return true;
        }
        return brokenComponents.size() != 0;
    }

    @Override
    public void update(Observable o, Object arg) {
        MachineComponent mc = (MachineComponent) o;
        if (mc.isBroken()) {
            if (!isBroken()) {
                setChanged();
                notifyObservers();
            }
            brokenComponents.add(mc);
        } else {
            boolean wasBroken = isBroken();
            brokenComponents.remove(mc);
            if (wasBroken) {
                setChanged();
                notifyObservers();
            }
        }


    }
}
