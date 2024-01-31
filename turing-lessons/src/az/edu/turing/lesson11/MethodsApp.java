package az.edu.turing.lesson11;

public class MethodsApp {
    public static void main(String[] args) {
        System.out.println(plusTwoDouble(3));
        System.out.println(plusTwoInt(5));
    }

    public static double plusTwoDouble(double a) {
        return a + 2;
    }

    public static int plusTwoInt(int a) {
        return a + 2;
    }
}
