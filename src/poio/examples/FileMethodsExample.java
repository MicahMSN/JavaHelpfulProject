package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

public class FileMethodsExample {

    public final static String testPath = ELConstants.FILE_READ_PATH;

    public static void main(String[] args)  {
       //implementation of example upped in util class
        POIOUtil.printFileInfo(testPath);
    }

}
