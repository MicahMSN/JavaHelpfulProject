package serialization;

import lautil.ELConstants;

import java.io.IOException;

import lautil.ELUtilities;

public class SerializationExample {

    public static final String path10 = ELConstants.GLOBAL_PATH + "file10";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write object to file
        ELUtilities.writeObjectToFile(new SerialClass("Name", 20, 3.14159), path10);
        //read object from file
        SerialClass sc = (SerialClass) ELUtilities.readObjectFromFile(path10);

    }
}
