package poio.examples.readwriterbased;

import lautil.ELConstants;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {

    public static String text = ELConstants.ALPHABET_ENGLISH_LOWER;

    public static void main(String[] args) throws IOException {
        int len = text.length();
        char[] arr = new char[len];
        text.getChars(0,len, arr,0);
        int data;
        try(CharArrayReader reader = new CharArrayReader(arr)){
            while((data = reader.read()) != -1){
                System.out.print((char)data);
            }
        }
    }
}
