package poio.examples.ioputstreambased;

import lautil.ELConstants;

import java.io.*;

public class DataIOStreamExample {

    public static final String path7 = ELConstants.GLOBAL_PATH + "file7.dat";

    public static void main(String[] args) throws IOException {
        //Write to file
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(path7))){
            dos.writeInt(1515);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
        }
        //Read from file
        try(DataInputStream dis = new DataInputStream(new FileInputStream(path7))){
            //the sequence is important
            int i = dis.readInt();
            double d = dis.readDouble();
            boolean b = dis.readBoolean();
            System.out.println("Values: ");
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        }
    }
}
