package cat.udl.ampli.exs.ex8;

import java.util.List;
import java.util.Observable;

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
