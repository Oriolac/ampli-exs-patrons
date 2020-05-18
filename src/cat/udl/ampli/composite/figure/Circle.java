package cat.udl.ampli.composite.figure;

public class Circle extends Figure {
    private final int r;

    protected Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Circle circle) {
        super(circle);
        this.r = circle.r;
    }

    @Override
    Figure copy() {
        return new Circle(this);
    }


}
