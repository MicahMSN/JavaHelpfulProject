package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SeekableByteChannelExample {

    public static String path12 = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        int count;
        Path filePath = Paths.get(path12);
        try (SeekableByteChannel sbc = Files.newByteChannel(filePath)) {
            ByteBuffer buf = ByteBuffer.allocate(128);
            do {
                count = sbc.read(buf);
                if (count != -1) {
                    buf.rewind(); //prepare buffer for read from it
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buf.get());
                    }
                }
            } while (count != -1);
        }
    }
}
