package az.edu.turing.module1.lesson4.figures;

public class PlainFigure extends Figure{
    double perimeter;
    String name;

    public PlainFigure(String type, double perimeter, String name) {
        super(type);
        this.perimeter = perimeter;
        this.name = name;
    }

    public void printPerimeter (){
        System.out.println("Perimeter is: " + perimeter);
    }
}
