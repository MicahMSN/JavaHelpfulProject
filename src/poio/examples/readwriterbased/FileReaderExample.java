package poio.examples.readwriterbased;

import lautil.ELConstants;
import poio.POIOUtil;

import java.io.IOException;

public class FileReaderExample {

    public static final String readPath = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        POIOUtil.readWithFileReaderCharByChar(readPath);
    }
}
