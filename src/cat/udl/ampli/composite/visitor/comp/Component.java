package cat.udl.ampli.composite.visitor.comp;

import cat.udl.ampli.composite.visitor.ComponentVisitor;

public abstract class Component {
    public abstract void accept(ComponentVisitor cv);
}
