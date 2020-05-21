package cat.udl.ampli.iterator.composite;

import java.util.Set;

public interface AcycliclyIterable<E> extends Iterable<E> {
    ComponentIterator<E> iterator(Set<E> visited);
}
