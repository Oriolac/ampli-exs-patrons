package cat.udl.ampli.iterator.composite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class ProcessComponent implements AcycliclyIterable<ProcessComponent> {
    @Override
    public abstract ComponentIterator<ProcessComponent> iterator(Set<ProcessComponent> visited);

    @Override
    public Iterator<ProcessComponent> iterator() {
        return iterator(new HashSet<>());
    }
}
