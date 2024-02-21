package az.edu.turing.module1.lesson4.figures;

public class PhaseFigure extends Figure{
    double area;
    String name;

    public PhaseFigure(String type, double area, String name) {
        super(type);
        this.area = area;
        this.name = name;
    }

    public void printArea (){
        System.out.println("Area is: " + area);
    }
}
