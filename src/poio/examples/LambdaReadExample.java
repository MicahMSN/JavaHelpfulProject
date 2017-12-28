package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

import java.io.IOException;
import java.util.List;

public class LambdaReadExample {

    public final static String testPath = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        POIOUtil.readListOfStringsFromFile(testPath).forEach(System.out::println);
    }
}
