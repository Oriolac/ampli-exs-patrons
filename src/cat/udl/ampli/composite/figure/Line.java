package cat.udl.ampli.composite.figure;

public class Line extends Figure {
    private final int x2;
    private final int y2;

    protected Line(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Line line) {
        super(line);
        this.x2 = line.x2;
        this.y2 = line.y2;
    }


    @Override
    Figure copy() {
        return new Line(this);
    }
}
