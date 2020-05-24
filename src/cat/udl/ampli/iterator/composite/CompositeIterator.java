package cat.udl.ampli.iterator.composite;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CompositeIterator<E extends AcycliclyIterable<E>> extends ComponentIterator<E> {

    protected Iterator<E> children;
    protected E peek;
    protected ComponentIterator<E> subiterator; // Cosa semblant a una pila

    public CompositeIterator(E head, List<E> components, Set<E> visited) {
        super(head, visited);
        children = components.iterator();
    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        if (peek == null)
            peek = next();
        return peek != null;
    }

    @Override
    public E next() {
        if (peek != null) {  //Next has already been calculated
            E result = peek;
            peek = null;
            return result;
        }
        if (!visited.contains(head)) { // Need to calculate the next
            visited.add(head);
            if (shouldShowIterator()) return head; // In case does have to return information of head

        }
        return nextDescendant();
    }

    /**
     * Needs to call 'recursively'
     *
     * @return the next head of next node
     */
    private E nextDescendant() {
        while (true) {
            if (subiterator != null && subiterator.hasNext()) {
                return subiterator.next();
            }
            if (!children.hasNext()) return null;
            E pc = children.next();
            if (!visited.contains(pc)) {
                subiterator = pc.iterator(visited);
                subiterator.setShowIterator(shouldShowIterator());
            }
        }
    }
}
