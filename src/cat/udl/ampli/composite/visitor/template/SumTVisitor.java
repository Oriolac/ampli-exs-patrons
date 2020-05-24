package cat.udl.ampli.composite.visitor.template;

import cat.udl.ampli.composite.visitor.comp.Leaf;

public class SumTVisitor extends TemplateVisitor {
    private int sum;

    public SumTVisitor() {
        sum = 0;
    }

    @Override
    void doVisit(Leaf l) {
        sum += l.getInfo();
    }

    public int getSum() {
        return sum;
    }
}

