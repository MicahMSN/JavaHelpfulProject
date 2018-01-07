package lambda;

import lambda.funinterfaces.DoubleGetter;

public class GetDoubleExample {
    public static void main(String[] args) {
        DoubleGetter dg;
        dg = ()->123.45d;
        System.out.println(dg.getDouble());
    }
}
