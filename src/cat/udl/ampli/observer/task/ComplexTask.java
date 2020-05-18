package cat.udl.ampli.observer.task;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class ComplexTask extends ObservableTask implements Observer {

    protected List<ObservableTask> tasks;

    public void addSubTask(ObservableTask subTask) {
        tasks.add(subTask);
        subTask.addObserver(this);
    }

    @Override
    public Money costInEuros() {
        Money accum = new Money(0);
        for (Task task : tasks) {
            accum = accum.add(task.costInEuros());
        }
        return accum;
    }

    @Override
    public boolean hasFinished() {
        return tasks.stream().allMatch(Task::hasFinished);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (hasFinished()) {
            setChanged();
            notifyObservers();
        }
    }
}
