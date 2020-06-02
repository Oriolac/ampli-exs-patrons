package cat.udl.ampli.strategy.modify.template;

import cat.udl.ampli.strategy.modify.Person;

public abstract class IncrementerTemplate {

    protected Person person;

    public IncrementerTemplate(Person person) {
        this.person =person;
    }

    public void increment() {
        System.out.println("HAS INCREMENTED");
        doAction();
    }

    protected abstract void doAction();

}
