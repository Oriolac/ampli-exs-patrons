package cat.udl.ampli.iterator.composite;

import java.util.Iterator;
import java.util.Set;

public abstract class ComponentIterator<E> implements Iterator<E> {

    protected final E head;
    protected final Set<E> visited;
    protected boolean returnIterator = true;

    public ComponentIterator(E head, Set<E> visited) {
        this.head = head;
        this.visited = visited;
    }

    public boolean shouldShowIterator() {
        return returnIterator;
    }

    public void setShowIterator(boolean value) {
        returnIterator = value;
    }

    public abstract int getDepth();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("ComponentIterator.Remove");
    }
}
