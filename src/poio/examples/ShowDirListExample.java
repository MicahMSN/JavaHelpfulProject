package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

public class ShowDirListExample {
    public final static String testPath = ELConstants.GLOBAL_PATH;

    public static void main(String[] args) {
        //implementation of example upped in util class
        POIOUtil.showListOfDirectory(testPath);
    }
}
