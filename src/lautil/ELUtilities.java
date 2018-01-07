package lautil;

import poio.POIOUtil;

import java.io.*;
import java.util.List;

public class ELUtilities {

    /**
     * Reads list of strings from file, using jdk8.
     */
    public static List<String> readListOfStringFromFile(String filePath) throws IOException {
        return POIOUtil.readListOfStringsFromFile(filePath);
    }

    /**
     * Searialization object to file, using default mechanism.
     */
    public static void writeObjectToFile(Serializable o, String path) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(o);
        }
    }

    /**
     * Desearialization object from file, using default mechanism.
     */
    public static Object readObjectFromFile(String path) throws IOException, ClassNotFoundException {
        Object result = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            result = ois.readObject();
        }
        return result;
    }

}
