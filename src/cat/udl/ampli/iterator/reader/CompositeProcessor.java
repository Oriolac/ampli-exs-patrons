package cat.udl.ampli.iterator.reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite processor in order not to make more than
 * one loop for processing an element.
 *
 * @param <E>
 */
public class CompositeProcessor<E> extends SequenceProcessor<E> {

    private final List<SequenceProcessor<E>> processors;

    public CompositeProcessor() {
        processors = new ArrayList<>();
    }

    public void addProcessor(SequenceProcessor<E> processor) {
        processors.add(processor);
    }

    @Override
    protected void processElement(E element) {
        for (var proc : processors) {
            proc.processElement(element);
        }
    }
}
