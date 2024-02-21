package az.edu.turing.module1.lesson4.figures;

public class Cube extends PhaseFigure {
    double tile;

    public Cube(String type, double area, String name, double tile) {
        super(type, area, name);
        this.tile = tile;
    }

    public double perimeter(){
        return 12 * tile;
    }
}
