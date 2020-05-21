package cat.udl.ampli.iterator.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinesIterator implements Iterator<String> {

    private final BufferedReader reader;
    private String nextElement;

    public LinesIterator(BufferedReader reader) {
        this.reader = reader;
        nextElement();
    }

    private void nextElement() {
        try {
            nextElement = reader.readLine();
        } catch (IOException e) {
            nextElement = null;
        }
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }

    @Override
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException("NO ELEMENT");
        String next = nextElement;
        nextElement();
        return next;
    }
}
