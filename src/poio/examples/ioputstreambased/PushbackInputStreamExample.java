package poio.examples.ioputstreambased;

import poio.POIOUtil;

import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample {

    public final static String testString = "if (a == 10) a = 0;\n";

    public static void main(String[] args) throws IOException {
        int data;
        try (PushbackInputStream pis = new PushbackInputStream(POIOUtil.strToByteArrayInputStream(testString))) {
            while ((data = pis.read()) != -1) {
                switch (data) {
                    case '=':
                        if ((data = pis.read()) == '=') {
                            System.out.print("equals");
                        } else {
                            System.out.print("then");
                            pis.unread(data);
                        }
                        break;
                    default:
                        System.out.print((char) data);
                        break;
                }
            }
        }
    }
}
