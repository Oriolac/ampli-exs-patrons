package cat.udl.ampli.composite.visitor.strat;

import cat.udl.ampli.composite.visitor.ComponentVisitor;
import cat.udl.ampli.composite.visitor.comp.Component;
import cat.udl.ampli.composite.visitor.comp.Composite;
import cat.udl.ampli.composite.visitor.comp.Leaf;

import java.util.Set;

public class StrategyVisitor implements ComponentVisitor {

    private final LeafVisitor leafVisitor;
    private Set<Component> visited;

    protected StrategyVisitor(LeafVisitor leafVisitor) {
        this.leafVisitor = leafVisitor;
    }


    @Override
    public void visit(Leaf l) {
        if (!visited.add(l)) return;
        leafVisitor.doVisit(l);
    }

    @Override
    public void visit(Composite composite) {
        if (!visited.add(composite)) return;
        for (Component c : composite.getComponents()) {
            c.accept(this); // Double dispatch
        }
    }

}
