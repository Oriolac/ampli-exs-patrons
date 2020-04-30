package cat.udl.ampli.exs.ex1;

import java.util.Iterator;
import java.util.StringTokenizer;

public class STAdapterH extends StringTokenizer implements Iterator<Object> {
    /* S'han de definir els 3 constructors */
    public STAdapterH(String str, String delim, boolean returnDelim) {
        super(str, delim, returnDelim);
    }

    public STAdapterH(String str, String delim ){
        super(str, delim);
    }

    public STAdapterH(String str) {
        super(str);
    }

    @Override
    public boolean hasNext() {
        return hasMoreElements();
    }

    @Override
    public Object next() {
        return nextElement();
    }
}
