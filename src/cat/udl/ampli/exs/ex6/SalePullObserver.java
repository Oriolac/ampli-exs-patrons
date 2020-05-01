package cat.udl.ampli.exs.ex6;

import java.util.Observable;
import java.util.Observer;

public class SalePullObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Sale sender = (Sale) o;
        String description = sender.lastAddedDescription().getDescription();
        int price = sender.lastAddedDescription().getPrice();
        int accumTotal = sender.total();
        System.out.printf("%s - %d - %d\n", description, price, accumTotal);
    }
}
