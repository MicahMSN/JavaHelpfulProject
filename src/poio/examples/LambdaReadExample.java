package poio.examples;

import lautil.ELConstants;
import poio.POIOUtil;

import java.io.IOException;

public class LambdaReadExample {

    public final static String testPath = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        POIOUtil.readListOfStringsFromFile(testPath).forEach(System.out::println);
    }
}
