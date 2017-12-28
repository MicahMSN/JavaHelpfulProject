package poio.examples;

import poio.POIOUtil;
import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Example of reading a text from string source,
 * using BufferedInputStream and mark feature .
 */
public class BufferedInputStreamExample {

    public static String testString = "This is author copytight sym &copy; , and this &copy is not.\n";

    public static void main(String[] args) {
        int c;
        boolean marked = false;
        try (BufferedInputStream bis = new BufferedInputStream(POIOUtil.strToByteArrayInputStream(testString))) {
            while ((c = bis.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            bis.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print(" (c) ");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            bis.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
