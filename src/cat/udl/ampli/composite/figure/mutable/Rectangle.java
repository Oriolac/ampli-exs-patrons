package cat.udl.ampli.composite.figure.mutable;

public class Rectangle extends Figure {
    private final int widht;
    private final int height;

    protected Rectangle(int x, int y, int widht, int height) {
        super(x, y);
        this.widht = widht;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.height = rectangle.height;
        this.widht = rectangle.widht;
    }

    @Override
    Figure copy() {
        return new Rectangle(this);
    }
}
