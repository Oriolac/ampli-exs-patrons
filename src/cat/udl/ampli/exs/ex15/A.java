package cat.udl.ampli.exs.ex15;

public class A implements Common {
    @Override
    public void operation(Common other) {
        System.out.println("First dispatch");
        other.operationWithA(this);
    }

    @Override
    public void operationWithB(B other) {
        System.out.println("Second dispatch");
        System.out.println("BA");
    }

    @Override
    public void operationWithA(A other) {
        System.out.println("Second dispatch");
        System.out.println("AA");
    }

}
