package az.edu.turing.module1.lesson4.figures;

public class Circle extends PlainFigure{
    double radius;

    public Circle(String type, double perimeter, String name, double radius) {
        super(type, perimeter, name);
        this.radius = radius;
    }

    public double getArea (){
        return Math.PI * radius * radius;
    }
}
