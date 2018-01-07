package lambda;

import lambda.funinterfaces.IntChecker;

public class LambdaIsEvenExample {
    public static void main(String[] args) {
        IntChecker isEven = (n) -> n%2==0;
        for (int i = 1; i < 12; i++) {
            System.out.println(i + (isEven.check(i)? " is even": " is odd "));
        }
    }
}
