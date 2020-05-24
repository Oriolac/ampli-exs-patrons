package cat.udl.ampli.composite.visitor;

import cat.udl.ampli.composite.visitor.comp.Composite;
import cat.udl.ampli.composite.visitor.comp.Leaf;

public interface ComponentVisitor {

    void visit(Leaf c);

    void visit(Composite c);
}
