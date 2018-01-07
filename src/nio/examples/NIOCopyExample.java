package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCopyExample {

    public static String source = ELConstants.FILE_READ_PATH;
    public static String target = ELConstants.GLOBAL_PATH + "copy.txt";

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get(source), Paths.get(target), StandardCopyOption.REPLACE_EXISTING);
    }

}
