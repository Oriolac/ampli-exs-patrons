package cat.udl.ampli.exs.ex1;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<E> implements Iterator<E> {

    private final Enumeration<E> en;

    public EnumerationAdapter(Enumeration<E> en) {
        this.en = en;
    }

    @Override
    public boolean hasNext() {
        return en.hasMoreElements();
    }

    @Override
    public E next() {
        return en.nextElement();
    }
}
