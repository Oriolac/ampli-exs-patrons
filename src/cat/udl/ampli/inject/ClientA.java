package cat.udl.ampli.inject;

import javax.inject.Inject;

public class ClientA {

    private final Service service;

    @Inject
    public ClientA(Service service) {
        this.service = service;
    }

    public void serve() {
        service.run();
    }
}
