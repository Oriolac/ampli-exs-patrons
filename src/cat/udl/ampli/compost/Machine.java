package cat.udl.ampli.compost;

import java.util.Set;

public class Machine extends MachineComponent {
    @Override
    protected boolean isTree(Set<MachineComponent> set) {
        set.add(this);
        return true;
    }

    @Override
    protected int getMachineCount() {
        return 1;
    }
}
