package cat.udl.ampli.composite.visitor.strat;

import cat.udl.ampli.composite.visitor.comp.Leaf;

public class SumLeafVisitor implements LeafVisitor {

    private int sum;

    public SumLeafVisitor(int sum) {
        this.sum = sum;
    }

    @Override
    public void doVisit(Leaf l) {
        sum += l.getInfo();
    }

    public int getSum() {
        return sum;
    }
}
