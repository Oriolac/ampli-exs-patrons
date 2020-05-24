package cat.udl.ampli.composite.visitor.template;

import cat.udl.ampli.composite.visitor.comp.Leaf;

public class CountTVisitor extends TemplateVisitor {


    private int count;

    public CountTVisitor() {
        count = 0;
    }

    @Override
    void doVisit(Leaf l) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
