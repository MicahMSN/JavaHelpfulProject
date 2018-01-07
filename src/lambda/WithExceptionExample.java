package lambda;

import lambda.funinterfaces.DoubleDoubleArrayTesterWithThrowing;
import lambda.laexceptions.EmptyArrException;

public class WithExceptionExample {

    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4, 4};
        DoubleDoubleArrayTesterWithThrowing max = (n) -> {
            if (n == null || n.length == 0) {
                throw new EmptyArrException();
            }
            double m = Double.MIN_VALUE;
            for (int i = 0; i < n.length; i++) {
                if (n[i] > m) {
                    m = n[i];
                }
            }
            return m;
        };
        try {
            System.out.println(max.test(arr));
        } catch (EmptyArrException e) {
            e.printStackTrace();
        }
    }
}
