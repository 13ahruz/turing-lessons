package az.edu.turing.module1.lesson4.figures;

public class Triangle extends PlainFigure{

    double [] angles = new double[3];
    double [] tiles = new double[3];

    public Triangle(String type, double area, String name, double [] angles) {
        super(type, area, name);
        this.angles = angles;
    }

    public double calculateArea (){
        double s = (tiles[0] + tiles[1] + tiles[2]) / 2.0;
        double ar = Math.sqrt(s * (s - tiles[0]) * (s - tiles[1]) * (s - tiles[2]));
        return ar;
    }
}
