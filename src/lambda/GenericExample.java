package lambda;

import lambda.funinterfaces.OneArgTester;
import lautil.ELConstants;

public class GenericExample {

    public static void main(String[] args) {
        OneArgTester<String> upper = (str) -> {
            return str.toUpperCase();
        };
        OneArgTester<Integer> square = (i) -> {
            return i*i;
        };
        System.out.println(upper.test(ELConstants.ALPHABET_ENGLISH_LOWER));
        System.out.println(square.test(10));

    }
}
