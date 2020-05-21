package cat.udl.ampli.iterator.reader;

public class MeanLenght extends SequenceProcessor<String> {

    private int count;
    private int sum;

    public MeanLenght() {
        this.count = 0;
        this.sum = 0;
    }

    @Override
    protected void processElement(String element) {
        sum += element.length();
        count++;
    }

    public float getMeanLength() {
        return (float) sum / (float) count;
    }
}
