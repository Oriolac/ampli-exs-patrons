package cat.udl.ampli.composite.visitor.comp;

import cat.udl.ampli.composite.visitor.ComponentVisitor;

import java.util.Collections;
import java.util.List;

public class Composite extends Component {

    private List<Component> components;

    public List<Component> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public void accept(ComponentVisitor cv) {
        cv.visit(this);
    }
}
