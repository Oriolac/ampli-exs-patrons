package cat.udl.ampli.composite.visitor.strat;

import cat.udl.ampli.composite.visitor.comp.Leaf;

public interface LeafVisitor {

    void doVisit(Leaf l);
}
