package cat.udl.ampli.observer.task;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal cost;


    public Money(double i) {
        this.cost = new BigDecimal(i);
    }

    public Money(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Money add(Money m2) {
        return new Money(this.getCost().add(m2.getCost()));
    }
}
