package cat.udl.ampli.composite.visitor;

import cat.udl.ampli.composite.visitor.comp.Component;
import cat.udl.ampli.composite.visitor.comp.Composite;
import cat.udl.ampli.composite.visitor.comp.Leaf;

import java.util.HashSet;
import java.util.Set;

public class CountVisitor implements ComponentVisitor {

    private int count;
    private final Set<Component> visited;

    public CountVisitor() {
        this.count = 0;
        visited = new HashSet<>();
    }

    @Override
    public void visit(Leaf c) {
        if (!visited.add(c)) return;
        count++;
    }

    @Override
    public void visit(Composite composite) {
        if (!visited.add(composite)) return;
        for (Component c : composite.getComponents()) {
            c.accept(this); // Double dispatch
        }
    }

    public int getCount() {
        return count;
    }
}
