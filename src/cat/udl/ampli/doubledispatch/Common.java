package cat.udl.ampli.doubledispatch;
/*
Common ob1 = new A();
Common obj2 = new B();

(obj1, obj2).oppeeration();

obj1.operation(obj2);
 */
public interface Common {

    void operation(Common other);
    void operationWithB(B other);
    void operationWithA(A other);
}
