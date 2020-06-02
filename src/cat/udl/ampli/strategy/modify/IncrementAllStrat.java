package cat.udl.ampli.strategy.modify;

public class IncrementAllStrat implements StrategyIncrement {

    @Override
    public void doChanges(Person person) {
        person.incAge();
        person.incHeight();
    }
}
