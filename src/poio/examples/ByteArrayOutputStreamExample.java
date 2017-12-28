package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

    public static final String testPath = ELConstants.GLOBAL_PATH +"file6.txt";

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = POIOUtil.strToByteArrayOutputStream(ELConstants.ALPHABET_ENGLISH_LOWER);
        //write to another output stream
        try(FileOutputStream fos = new FileOutputStream(testPath)){
            baos.writeTo(fos);
        }
        //Reset for beginning state
        baos.reset();
        //Write in ByteArrayOutputStream and print
        baos.write('A');
        baos.close(); //no changes
        baos.write('b');
        baos.write('C');
        System.out.println(baos.toString());
    }
}
