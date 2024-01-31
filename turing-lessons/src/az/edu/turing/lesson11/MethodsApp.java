package az.edu.turing.lesson11;

public class MethodsApp {
    public static void main(String[] args) {
        System.out.println(PlusTwoDouble(3));
        System.out.println(PlusTwoInt(5));
    }

    public static double PlusTwoDouble(double a) {
        return a + 2;
    }

    public static int PlusTwoInt(int a) {
        return a + 2;
    }
}
