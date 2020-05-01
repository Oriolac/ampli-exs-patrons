package cat.udl.ampli.singleton;

public class SyncFactory {

    private static SyncFactory factory;

    private static final Object classLock = SyncFactory.class;

    private SyncFactory() {
    }

    public static SyncFactory getInstance() {
        synchronized (classLock) {
            if (factory == null)
                factory = new SyncFactory();
            return factory;
        }
    }
}
