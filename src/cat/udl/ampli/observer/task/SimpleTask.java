package cat.udl.ampli.observer.task;

public class SimpleTask extends ObservableTask {

    private final Money cost;
    private final int duration;
    private boolean hasFinished;

    public SimpleTask(Money cost, int duration) {
        this.cost = cost;
        this.duration = duration;
        hasFinished = false;
    }

    @Override
    public Money costInEuros() {
        return cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }

    @Override
    public boolean hasFinished() {
        return hasFinished;
    }

    public void finish() {
        if (!hasFinished) {
            hasFinished = true;
            this.setChanged();
            this.notifyObservers();
        }
    }
}
