package poio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *  Some features of standart i/o module, which can be useful later.
 */
public class POIOUtil {

    /**
     * Prints file's information.
     * Simple method for test File class's features.
     * Howewer, it can be also useful for bugs searching.
     */
    public static void printFileInfo(String filePath) {
        File f1 = new File(filePath);
        System.out.println("File name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println(f1.exists() ? "file exist" : "file is not exist");
        System.out.println(f1.canRead() ? "file readable" : "file is not readable");
        System.out.println(f1.canWrite() ? "file writable" : "file is not writable");
        System.out.println(f1.isDirectory() ? "It is directory" : "It is not directory");
        System.out.println(f1.isFile() ? "It is a simple file" : "It can be named channel");
        System.out.println(f1.isAbsolute() ? "It is absolute" : "It is not absolute");
        System.out.println("Last modified: " + f1.lastModified());
        System.out.println("Size is " + f1.length() + " byte");
    }

    /**
     * Prints the contents of a folder.
     */
    public static void showListOfDirectory(String filePath) {
        File f1 = new File(filePath);
        if (f1.isDirectory()) {
            System.out.println("Directory: " + filePath);
            String[] arr = f1.list();
            for (int i = 0; i < arr.length; i++) {
                File f = new File(filePath + "/" + arr[i]);
                if (f.isDirectory()) {
                    System.out.println(arr[i] + " is a directory");
                } else {
                    System.out.println(arr[i] + " is a file");
                }
            }
        } else {
            System.out.println("It is not a directory");
        }
    }

    /**
     * Prints the contents of a folder with filter by endsWith (ex: ".html").
     */
    public static void showListOfDirectory(String filePath, String ext) {
        File f1 = new File(filePath);
        if (f1.isDirectory()) {
            System.out.println("Directory: " + filePath);
            FilenameFilter only = (dir, name) -> name.endsWith(ext);
            String[] arr = f1.list(only);
            for (int i = 0; i < arr.length; i++) {
                File f = new File(filePath + "/" + arr[i]);
                if (f.isDirectory()) {
                    System.out.println(arr[i] + " is a directory");
                } else {
                    System.out.println(arr[i] + " is a file");
                }
            }
        } else {
            System.out.println("It is not a directory");
        }
    }

    /**
     * Read char by char, using FileInputStream, from file and prints it.
     */
    public static void readWithFileInputStreamCharByChar(String filePath) throws IOException {
        try (FileInputStream f = new FileInputStream(filePath)) {
            int n = f.available();
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
        }
    }

    /**
     * Reads list of strings from file, using jdk8. (prefered)
     */
    public static List<String> readListOfStringsFromFile(String filePath) throws IOException {
        List<String> list = new ArrayList<>();
        Files.lines(Paths.get(filePath), StandardCharsets.UTF_8).forEach(list::add);
        return list;
    }

    /**
     * Write source string in file byte by byte, using FileOutputStream.
     */
    public static void writeWithFileOutputStreamByteByByte(String testSource, String path) throws IOException {
        byte[] buf = testSource.getBytes();
        try(FileOutputStream f = new FileOutputStream(path)) {
            for (int i = 0; i <buf.length ; i++) {
                f.write(buf[i]);
            }
        }
    }

    /**
     * Perform source String in byte array and then write it in file, using FileOutputStream.
     */
    public static void writeWithFileOutputStreamWithBufArr(String testSource, String path) throws IOException {
        byte[] buf = testSource.getBytes();
        try(FileOutputStream f = new FileOutputStream(path)) {
            f.write(buf);
        }
    }

    public static ByteArrayInputStream strToByteArrayInputStream(String str){
        return new ByteArrayInputStream(str.getBytes());
    }
    public static ByteArrayOutputStream strToByteArrayOutputStream(String str) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // close not needed
        baos.write(str.getBytes());
        return baos;
    }

}


