package cat.udl.ampli.objectpool;

import cat.udl.ampli.objectpool.pc.PC;
import cat.udl.ampli.objectpool.pc.PCPool;
import cat.udl.ampli.objectpool.pc.PCStateException;

public class WorkerImpl implements Worker {

    private PC pc = null;

    @Override
    public void work(PC pc) throws PCStateException {
        pc.use();
        this.pc = pc;
    }

    @Override
    public void leave() throws PCStateException {
        pc.leave();
        pc = null;
    }

    public static void main(String[] args) throws PCStateException {
        PCPool pool = PCPool.getInstance();
        pool.buyPC();
        Worker worker = new WorkerImpl();
        PC pc = pool.getPC();
        worker.work(pc);
        worker.leave();
    }
}
