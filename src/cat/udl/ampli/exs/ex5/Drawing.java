package cat.udl.ampli.exs.ex5;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {

    final private List<Figure> figures;

    public Drawing(int x, int y) {
        super(x,y);
        this.figures = new ArrayList<>();
    }

    public Drawing(Drawing drawing) {
        super(drawing.getX(),drawing.getY());
        this.figures = new ArrayList<>();
        for (Figure figure : drawing.figures) {
            figures.add(figure.copy());
        }
    }

    public Drawing(Drawing draw, Figure newFigure) {
        this(draw);
        figures.add(newFigure);
    }

    @Override
    Figure copy() {
        return new Drawing(this);
    }

    public Drawing addFigures(Drawing figure) {
        return new Drawing(this, figure);
    }
}
