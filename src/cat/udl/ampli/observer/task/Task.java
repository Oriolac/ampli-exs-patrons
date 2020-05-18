package cat.udl.ampli.exs.task.observable;

public interface Task {
    Money costInEuros();
    int durationInDays();
    boolean hasFinished();
}
