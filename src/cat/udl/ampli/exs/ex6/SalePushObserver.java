package cat.udl.ampli.exs.ex6;

import java.util.Observable;
import java.util.Observer;

public class SalePushObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        CreateSalesLineItemDTO dto = (CreateSalesLineItemDTO) arg;
        System.out.printf("%s - %d - %d%n", dto.description, dto.price, dto.accumTotal);
    }
}
