package cat.udl.ampli.observer.task;

import java.util.List;

public class ParallelTask extends ComplexTask {
    public ParallelTask(Money cost, List<ObservableTask> tasks) {
        super(cost, tasks);
    }

    @Override
    public int durationInDays() {
        int acc = 0;
        for (Task st : tasks) {
            acc = Math.max(acc, st.durationInDays());
        }
        return acc;
    }


}
