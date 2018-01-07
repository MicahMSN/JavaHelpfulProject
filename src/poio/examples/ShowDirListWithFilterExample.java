package poio.examples;

import lautil.ELConstants;
import poio.POIOUtil;

public class ShowDirListWithFilterExample {
    public final static String testPath = ELConstants.GLOBAL_PATH;
    public final static String ext = ".PROPERTIES";

    public static void main(String[] args) {
        //implementation of example upped in lautil class
        POIOUtil.showListOfDirectory(testPath, ext);
    }
}
