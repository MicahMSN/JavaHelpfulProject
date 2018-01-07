package poio.examples.readwriterbased;

import lautil.ELConstants;
import poio.POIOUtil;

import java.io.IOException;

public class FileWriterExample {

    public static final String path8 = ELConstants.GLOBAL_PATH + "file8.txt";
    public static final String path9 = ELConstants.GLOBAL_PATH + "file9.txt";
    public static final String sourceText = ELConstants.THREE_SIMPLE_LINES;

    public static void main(String[] args) throws IOException {
        char buffer[] = new char[sourceText.length()];
        sourceText.getChars(0, sourceText.length(), buffer, 0);
        POIOUtil.writeWithFileWriterCharByChar(sourceText, path8);
        POIOUtil.writeWithFileWriterWithBuffer(sourceText, path9);
    }

}
