package lambda;

import lambda.funinterfaces.IntTester;

public class DivisorExample {

    public static void main(String[] args) {
        IntTester isFactor = (x, y) -> (x % y) == 0;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " is "+(!isFactor.test(10, i)?"not ":"") + "divisor for 10");
        }
    }
}
