package cat.udl.ampli.objectpool;

import cat.udl.ampli.objectpool.pc.PC;
import cat.udl.ampli.objectpool.pc.PCStateException;

public interface Worker {

    void work(PC pc) throws PCStateException;
    void leave() throws PCStateException;
}
