package az.edu.turing.module0.trash;

import java.io.Serializable;

public class Circle extends Figure{
    int area;

    public Circle(String prophet, int size, int area) {
        super(prophet, size);
        this.area = area;
    }
}
