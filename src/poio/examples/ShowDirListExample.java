package poio.examples;

import lautil.ELConstants;
import poio.POIOUtil;

public class ShowDirListExample {
    public final static String testPath = ELConstants.GLOBAL_PATH;

    public static void main(String[] args) {
        //implementation of example upped in lautil class
        POIOUtil.showListOfDirectory(testPath);
    }
}
