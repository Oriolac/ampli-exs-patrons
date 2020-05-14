package cat.udl.ampli.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public interface AcycliclyIterable<E> extends Iterable<E> {
    ComponentIterator<E> iterator(Set<E> visited);
}
