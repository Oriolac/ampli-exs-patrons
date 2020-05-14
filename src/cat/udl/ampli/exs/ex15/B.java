package cat.udl.ampli.exs.ex15;

public class B implements Common {
    @Override
    public void operation(Common other) {
        System.out.println("First dispatch");
        other.operationWithB(this);
    }

    @Override
    public void operationWithB(B other) {
        System.out.println("Second dispatch");
        System.out.println("BB");
    }

    @Override
    public void operationWithA(A other) {
        System.out.println("Second dispatch");
        System.out.println("AB");
    }
}
