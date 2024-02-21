package az.edu.turing.module1.lesson4.figures;

public class Sphere extends PhaseFigure{
    double radius;

    public Sphere(String type, double area, String name, double radius) {
        super(type, area, name);
        this.radius = radius;
    }
    public double getArea (){
        return 4 * Math.PI * radius * radius;
    }
}
