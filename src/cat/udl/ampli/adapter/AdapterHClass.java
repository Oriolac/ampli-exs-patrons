package cat.udl.ampli.adapter;

public class AdapterHClass extends ExistingClass implements RequiredInterface{

    private final int a;

    AdapterHClass(int a) {
        super();
        this.a = a;
    }

    @Override
    public int suma(int b) {
        return sum(this.a, b);
    }
}
