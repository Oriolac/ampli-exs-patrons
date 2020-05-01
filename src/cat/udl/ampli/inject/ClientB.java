package cat.udl.ampli.inject;

import javax.inject.Inject;

public class ClientB {

    @Inject
    private Service service;

    public void serve() {
        service.run();
    }

}
