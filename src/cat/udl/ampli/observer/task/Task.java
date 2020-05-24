package cat.udl.ampli.observer.task;

public interface Task {
    Money costInEuros();

    int durationInDays();

    boolean hasFinished();
}
