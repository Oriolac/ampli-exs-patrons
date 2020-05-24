package cat.udl.ampli.composite.visitor.comp;

import cat.udl.ampli.composite.visitor.ComponentVisitor;

public class Leaf extends Component {
    private int info;

    public int getInfo() {
        return info;
    }

    @Override
    public void accept(ComponentVisitor cv) {
        cv.visit(this);
    }
}
