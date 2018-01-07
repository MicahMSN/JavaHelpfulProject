package lambda;

import lambda.funinterfaces.StrStrPerformancer;
import lautil.ELConstants;

public class StaticMethodReferenceExample {

    static String strReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        StrStrPerformancer reverse = StaticMethodReferenceExample::strReverse;
        System.out.println(reverse.perform(ELConstants.ALPHABET_ENGLISH_LOWER));
    }
}
