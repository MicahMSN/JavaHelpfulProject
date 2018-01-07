package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWriteExample {

    public static final String path = ELConstants.GLOBAL_PATH + "file12.txt";
    public static final String text = ELConstants.ALPHABET_ENGLISH_LOWER;

    public static void main(String[] args) throws IOException {
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(path), StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            byteBuffer.put(text.getBytes());
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);
            byteBuffer.rewind();
        }
    }
}
