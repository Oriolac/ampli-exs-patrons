package cat.udl.ampli.composite.machine;

import java.util.HashSet;
import java.util.Set;

public abstract class MachineComponent {
    protected abstract boolean isTree(Set<MachineComponent> set);

    public boolean isTree() {
        return isTree(new HashSet<>());
    }


    protected abstract int getMachineCount();
}
