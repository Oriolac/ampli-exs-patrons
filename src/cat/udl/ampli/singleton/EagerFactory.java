package cat.udl.ampli.singleton;

/**
 * Strict initialization
 */
public class EagerFactory {

    public static final EagerFactory INSTACE = new EagerFactory();

    private EagerFactory() {

    }
}
