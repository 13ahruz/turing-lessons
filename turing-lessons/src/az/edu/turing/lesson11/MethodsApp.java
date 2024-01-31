package az.edu.turing.lesson11;

public class MethodsApp {
    public static void main(String[] args) {
        printChar(new char[]{'A', 'B', 'C'});
    }

    public static void printChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
