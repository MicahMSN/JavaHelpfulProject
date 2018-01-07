package lambda;

import lambda.funinterfaces.IntIntFunctionDependencer;

public class CaptureExample {

    public static void main(String[] args) {
        int number = 101;
        IntIntFunctionDependencer adder = (n) ->{
            int value = n+number;
            //num++ unable capture
            return value;
        };
        System.out.println(adder.getOrdinate(10));
    }
}
