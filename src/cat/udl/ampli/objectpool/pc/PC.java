package cat.udl.ampli.objectpool.pc;

public interface PC {
    boolean isAvailable();
    void use() throws PCStateException;
    void leave() throws PCStateException;
}
