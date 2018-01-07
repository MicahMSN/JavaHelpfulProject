package poio.examples.ioputstreambased;

import lautil.ELConstants;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample {

    public static void main(String[] args) throws IOException {
        int data;
        Vector<String> files = new Vector<String>();
        files.addElement(ELConstants.GLOBAL_PATH + "file1.txt.txt");
        files.addElement(ELConstants.GLOBAL_PATH + "file2.txt.txt");
        files.addElement(ELConstants.GLOBAL_PATH + "file3.txt.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception ignored) {
        }
    }

    static class InputStreamEnumerator implements Enumeration<FileInputStream> {
        private Enumeration<String> files;

        public InputStreamEnumerator(Vector<String> files) {
            this.files = files.elements();
        }

        @Override
        public boolean hasMoreElements() {
            return files.hasMoreElements();
        }

        @Override
        public FileInputStream nextElement() {
            try {
                return new FileInputStream(files.nextElement().toString());
            } catch (FileNotFoundException e) {
                return null;
            }
        }
    }

}

