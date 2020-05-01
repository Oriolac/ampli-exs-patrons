package cat.udl.ampli.exs.ex5;

public abstract class Figure {

    private final int x;
    private final int y;

    protected Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure(Figure f) {
        this.x = f.x;
        this.y = f.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    abstract Figure copy();
}
