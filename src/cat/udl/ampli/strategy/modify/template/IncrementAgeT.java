package cat.udl.ampli.strategy.modify.template;

import cat.udl.ampli.strategy.modify.Person;
import cat.udl.ampli.strategy.modify.template.IncrementerTemplate;

public class IncrementAgeT extends IncrementerTemplate {
    public IncrementAgeT(Person person) {
        super(person);
    }

    @Override
    protected void doAction() {
        person.incAge();
    }
}
