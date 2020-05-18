package cat.udl.ampli.exs.saleobserver;

import java.util.Observer;

/**
 * Classe controladora
 */
public class Register {

    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    /**
     * Per què es posa l'Observador per paràmetre?
     * Doncs SaleObserver pertany a la capa d'implementació i no del domini del problema.
     * En cas que ho fiquessim, seria una dependència descontrolada (a meś de no poder utilitzar tests sobre aquesta)
     * @param saleObserver Patró observador és Observer perquè s'aplica el principi d'inversió de dependències.
     */
    public void createNewSale(Observer saleObserver) {
        currentSale = new Sale();
        currentSale.addObserver(saleObserver);
    }
}
