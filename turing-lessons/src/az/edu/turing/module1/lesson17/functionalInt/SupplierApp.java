package az.edu.turing.module1.lesson17.functionalInt;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        new Supplier<Integer>(){
            @Override
            public Integer get (){
                return  (int) (Math.random() * 101);
            }
        }   ;

        System.out.println();
    }
}
