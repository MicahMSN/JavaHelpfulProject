package lambda;

import lambda.funinterfaces.StrStrPerformancer;
import lautil.ELConstants;

public class ArgumentLambdaExample {

    static String opStr(StrStrPerformancer performancer, String str){
        return performancer.perform(str);
    }

    public static void main(String[] args) {
        System.out.println(opStr((text)->text.toUpperCase(), ELConstants.ALPHABET_ENGLISH_LOWER));
    }

}
