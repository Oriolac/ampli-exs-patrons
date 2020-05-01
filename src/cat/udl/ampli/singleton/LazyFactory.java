package cat.udl.ampli.singleton;

/**
 * Lazy initialization
 */
public class LazyFactory {

    private static LazyFactory factory;

    private LazyFactory() { }

    public static LazyFactory getInstance() {
        if (factory == null)
            factory = new LazyFactory();
        return factory;
    }

}
