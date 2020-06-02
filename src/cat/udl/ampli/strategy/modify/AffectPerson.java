package cat.udl.ampli.strategy.modify;

public class AffectPerson {

    Person person;
    StrategyIncrement strat;

    public AffectPerson(Person person, StrategyIncrement strat) {
        this.person = person;
        this.strat = strat;
    }

    public void makeChanges() {
        System.out.println("S'HA INCREMENTAT ALGO");
        strat.doChanges(person);
    }
}
