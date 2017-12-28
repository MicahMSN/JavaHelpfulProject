package poio.examples;

import constants.ELConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static poio.POIOUtil.readWithFileInputStreamCharByChar;

public class FileInputStreamExample {

    public static String testString = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream(testString)) {
            System.out.println("0 Total amount of available bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("First " + n + "bytes readed using method read(): ");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("1 Total amount of available bytes: " + (size = f.available()));
            System.out.println("Read next " + n + " bytes, using read(b[])");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("It is not availible to read " + n + " bytes");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("2 Total amount of available bytes: " + (size = f.available()));
            System.out.println("Skip half of available bytes...");
            f.skip(size / 2);
            System.out.println("3 Total amount of available bytes: " + (size = f.available()));
            System.out.println("Read " + n / 2 + " bytes from end");
            if (f.read(b, n / 2, n / 2) != n) {
                System.err.println("It is not availible to read " + n + " bytes");
            }
            System.out.println(new String(b, 0, b.length));
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }

        try {
            examp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void examp() throws IOException {
        readWithFileInputStreamCharByChar(testString);
    }
}
