package poio.examples;

import constants.ELConstants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Simple example of reading a text from file source,
 * using BufferedReader.
 */
public class BufferedReaderExample {

    public static String testSource = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(testSource), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ignored){}
    }
}
