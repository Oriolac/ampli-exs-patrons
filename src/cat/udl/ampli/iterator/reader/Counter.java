package cat.udl.ampli.iterator.reader;

public class Counter extends SequenceProcessor<String> {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    protected void processElement(String element) {
        count++;
    }
}
