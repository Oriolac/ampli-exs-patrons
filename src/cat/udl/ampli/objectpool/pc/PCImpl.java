package cat.udl.ampli.objectpool.pc;

public class PCImpl implements PC {

    private boolean available;

    protected PCImpl() {
        this.available = true;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }

    @Override
    public void use() throws PCStateException {
        if(!this.available) {
            throw new PCStateException();
        }
        this.available = false;
    }

    @Override
    public void leave() throws PCStateException {
        if(this.available) {
            throw new PCStateException();
        }
        this.available = true;
    }
}
