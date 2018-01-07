package lambda;

import lambda.funinterfaces.IntIntFunctionDependencer;

public class FactorialExample {

    public static void main(String[] args) {
        IntIntFunctionDependencer factorial = (n) -> {
            int result = 1;
            for (int i = 1; i < n; i++) {
                result=result*i;
            }
            return result;
        };
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Factorial of " + i + " = " + factorial.getOrdinate(i));
        }
    }
}
