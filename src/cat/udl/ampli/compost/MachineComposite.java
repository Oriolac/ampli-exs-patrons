package cat.udl.ampli.compost;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MachineComposite extends MachineComponent {

    protected List<MachineComponent> components = new ArrayList<>();

    public int getMachineCount() {
        int sum = 0;
        for(MachineComponent c : components) {
            /* S'ha de vigilar si és cicle!!!!
             Arreglar-ho amb un if, semblant al de isTree */
            sum += c.getMachineCount();
        }
        return sum;
    }

    @Override
    protected boolean isTree(Set<MachineComponent> set) {
        set.add(this);
        for (MachineComponent c: components) {
            if (set.contains(c) || !c.isTree(set))
                return false;
        }
        return true;
    }
}
