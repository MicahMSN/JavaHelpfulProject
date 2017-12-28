package poio.examples;

import constants.ELConstants;
import poio.POIOUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static final String testSource = "This is test source string\n"+
            "Next line of test source string\n"+
            "This is enough to test write to a file.";

    public static final String path1 = ELConstants.GLOBAL_PATH + "file1.txt";
    public static final String path2 = ELConstants.GLOBAL_PATH + "file2.txt";
    public static final String path3 = ELConstants.GLOBAL_PATH + "file3.txt";
    public static final String path4 = ELConstants.GLOBAL_PATH + "file4.txt";
    public static final String path5 = ELConstants.GLOBAL_PATH + "file5.txt";

    public static void main(String[] args) {
        byte[] buf = testSource.getBytes();
        try(FileOutputStream f1 = new FileOutputStream(path1);
            FileOutputStream f2 = new FileOutputStream(path2);
            FileOutputStream f3 = new FileOutputStream(path3))
        {
            for (int i = 0; i <buf.length ; i+=2) {
                f1.write(buf[i]);
            }
            f2.write(buf);
            f3.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    examp1();
    examp2();
    }

    public static void examp1(){
        try {
            POIOUtil.writeWithFileOutputStreamByteByByte(testSource, path4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void examp2(){
        try {
            POIOUtil.writeWithFileOutputStreamWithBufArr(testSource, path5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
