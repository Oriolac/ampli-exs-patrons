package cat.udl.ampli.composite.task;

import java.util.List;

public class ParallelTask extends ComplexTask {
    public ParallelTask(Money cost, List<Task> tasks) {
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
