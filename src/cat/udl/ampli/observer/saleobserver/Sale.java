package cat.udl.ampli.observer.saleobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Sale extends Observable {

    private List<SaleLineItem> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SaleLineItem saleLineItem = new SaleLineItem(desc, quantity);
        lines.add(saleLineItem);
        setChanged();
        //notifyObservers(); // pull or push? pull
        notifyObservers(new CreateSalesLineItemDTO(desc.getDescription(), desc.getPrice(), total())); //push
    }


    //pull => afegir nous mètodes per interrogat
    // push =/=> no caldrà afegir nous mètodes

    public int total() {
        int total = 0;
        for (SaleLineItem sli : lines) {
            total += sli.subTotal();
        }
        return total;
    }

    /**
     * Method for pull version
     *
     * @return the last sale item
     */
    public SaleLineItem lastItem() {
        return this.lines.get(lines.size() - 1);
    }

    public ProductDescription lastAddedDescription() {
        return lastItem().getDesc();
    }
}
