package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

public class ShowDirListWithFilterExample {
    public final static String testPath = ELConstants.GLOBAL_PATH;
    public final static String ext = ".PROPERTIES";

    public static void main(String[] args) {
        //implementation of example upped in util class
        POIOUtil.showListOfDirectory(testPath, ext);
    }
}
