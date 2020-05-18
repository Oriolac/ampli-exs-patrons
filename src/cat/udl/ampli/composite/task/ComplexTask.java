package cat.udl.ampli.exs.task.composite;

import java.util.List;

public abstract class ComplexTask implements Task {

    private final Money cost;
    protected List<Task> tasks;

    public ComplexTask(Money cost, List<Task> tasks) {
        this.cost = cost;
        this.tasks = tasks;
    }

    @Override
    public Money costInEuros() {
        Money accum = new Money(0);
        for (Task task : tasks) {
            accum = accum.add(task.costInEuros());
        }
        return accum;
    }
}
