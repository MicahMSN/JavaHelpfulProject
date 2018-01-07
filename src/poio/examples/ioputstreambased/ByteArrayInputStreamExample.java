package poio.examples.ioputstreambased;

import lautil.ELConstants;
import poio.POIOUtil;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) {
        String tmp = ELConstants.ALPHABET_ENGLISH_LOWER;
        byte[] b = tmp.getBytes();
        ByteArrayInputStream input1 = POIOUtil.strToByteArrayInputStream(tmp);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3); // contains only 3 first characters

        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = input2.read()) != -1){
                if(i==0){
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            input2.reset();
        }
    }
}
