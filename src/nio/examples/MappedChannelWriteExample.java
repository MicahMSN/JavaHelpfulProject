package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWriteExample {

    public static final String path = ELConstants.GLOBAL_PATH + "file13.txt";
    public static final String text = ELConstants.THREE_SIMPLE_LINES;

    public static void main(String[] args) throws IOException {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(path), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            byte[] arr = text.getBytes();
            for (int i = 0; i < 26; i++) {
                mappedByteBuffer.put(arr[i]);
            }
        }
    }
}
