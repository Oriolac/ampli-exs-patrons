package cat.udl.ampli.adapter.string;

import java.util.Iterator;
import java.util.StringTokenizer;

public class STAdapterC implements Iterator<Object> {
    /* Could be Enumeration<Object>! */
    private final StringTokenizer st;

    public STAdapterC(StringTokenizer st) {
        this.st = st;
    }

    @Override
    public boolean hasNext() {
        return st.hasMoreElements(); //Delegació
    }

    @Override
    public Object next() {
        return st.nextElement();
    }
}
