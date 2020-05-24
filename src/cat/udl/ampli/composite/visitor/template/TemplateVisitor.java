package cat.udl.ampli.composite.visitor.template;

import cat.udl.ampli.composite.visitor.ComponentVisitor;
import cat.udl.ampli.composite.visitor.comp.Component;
import cat.udl.ampli.composite.visitor.comp.Composite;
import cat.udl.ampli.composite.visitor.comp.Leaf;

import java.util.Set;

public abstract class TemplateVisitor implements ComponentVisitor {
    private Set<Component> visited;

    abstract void doVisit(Leaf l);

    @Override
    public void visit(Leaf l) {
        if (!visited.add(l)) return;
        doVisit(l);
    }

    @Override
    public void visit(Composite composite) {
        if (!visited.add(composite)) return;
        for (Component c : composite.getComponents()) {
            c.accept(this); // Double dispatch
        }

    }
}
