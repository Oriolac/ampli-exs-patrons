package cat.udl.ampli.exs.task.composite;

public class SimpleTask implements Task {

    private final Money cost;
    private final int duration;

    public SimpleTask(Money cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public Money costInEuros() {
        return cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }
}
