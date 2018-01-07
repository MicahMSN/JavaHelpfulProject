package poio.examples;

import lautil.ELConstants;
import poio.POIOUtil;

public class FileMethodsExample {

    public final static String testPath = ELConstants.FILE_READ_PATH;

    public static void main(String[] args)  {
       //implementation of example upped in lautil class
        POIOUtil.printFileInfo(testPath);
    }

}
