package cat.udl.ampli.composite.task;

import java.util.List;

public class SequentialTask extends ComplexTask {


    public SequentialTask(Money cost, List<Task> tasks) {
        super(cost, tasks);
    }

    @Override
    public int durationInDays() {
        int res = 0;
        for (Task t : this.tasks) {
            res += t.durationInDays();
        }
        return res;
    }
}
