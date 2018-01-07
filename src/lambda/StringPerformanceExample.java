package lambda;

import lambda.funinterfaces.StrStrPerformancer;
import lautil.ELConstants;

public class StringPerformanceExample {
    public static void main(String[] args) {
        StrStrPerformancer reverse = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };
        System.out.println(reverse.perform(ELConstants.ALPHABET_ENGLISH_LOWER));
    }
}
