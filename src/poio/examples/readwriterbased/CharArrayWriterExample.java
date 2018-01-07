package poio.examples.readwriterbased;

import lautil.ELConstants;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterExample {

    public static final String text = ELConstants.ALPHABET_ENGLISH_LOWER;

    public static void main(String[] args) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        char[] buf = new char[text.length()];
        text.getChars(0, text.length(), buf, 0);
        writer.write(buf);
        System.out.print("CharArrayWriter.toString(): ");
        System.out.println(writer.toString());
        System.out.print("CharArrayWriter.toCharArray(): ");
        System.out.println(writer.toCharArray());

    }
}
