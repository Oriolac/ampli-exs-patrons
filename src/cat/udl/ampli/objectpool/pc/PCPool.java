package cat.udl.ampli.objectpool.pc;

import java.util.Stack;

public class PCPool {

    private static PCPool pool = new PCPool();
    private Stack<PC> pcs;

    public PCPool() {
        pcs = new Stack<>();
    }

    private void addPC(PC pc) {
        pcs.push(pc);
    }

    private PC removePC() {
        if(pcs.isEmpty()) {
            throw new IllegalStateException();
        }
        return pcs.pop();
    }

    public static PCPool getInstance() {
        return pool;
    }

    public void buyPC() {
        pcs.push(new PCImpl());
    }

    public void returnPC(PC pc) {
        this.addPC(pc);
    }

    public PC getPC() {
        return this.removePC();
    }
}
