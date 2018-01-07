package poio.examples.readwriterbased;

import poio.POIOUtil;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackReaderExample {

    public static void main(String[] args) throws IOException {
        String str = "if (a == 4) a = 0; \n";
        int data;
        try (PushbackReader reader = new PushbackReader(new CharArrayReader(str.toCharArray()))) {
            while ((data = reader.read()) != -1) {
                if (data == '=') {
                    if ((data = reader.read()) == '=') {
                        System.out.print(" equals ");
                    } else {
                        System.out.print(" then ");
                        reader.unread(data);
                    }
                } else {
                    System.out.print((char) data);
                }
            }
        }
    }
}
