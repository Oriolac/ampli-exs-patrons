package cat.udl.ampli.iterator;

import java.util.Set;

public class LeafIterator<E> extends ComponentIterator<E> {
    public LeafIterator(E head, Set<E> visited) {
        super(head, visited);
    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return !visited.contains(head);
    }

    @Override
    public E next() {
        if (visited.contains(head)) return null;

        visited.add(head);
        return head;
    }
}
