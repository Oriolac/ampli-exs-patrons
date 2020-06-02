package cat.udl.ampli.composite.figure.immutablebuilder;

public abstract class Figure {

    private final Point point;

    private static class Point {

        private final int y;
        private final int x;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public Figure(int x, int y) {
        this.point = new Point(x,y);
    }

}
