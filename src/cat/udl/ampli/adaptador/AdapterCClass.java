package cat.udl.ampli.adaptador;

import java.security.InvalidParameterException;

public class AdapterCClass implements RequiredInterface {

    private final ExistingClass c;
    private final int a;

    public AdapterCClass(ExistingClass c, int a) {
        this.c = c;
        this.a = a;
    }

    @Override
    public int suma(int b) {
        return c.sum(this.a, b);
    }
}
