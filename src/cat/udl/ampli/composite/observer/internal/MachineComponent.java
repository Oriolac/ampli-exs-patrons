package cat.udl.ampli.composite.observer.internal;

public abstract class MachineComponent {

    private final long id;

    public MachineComponent(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
