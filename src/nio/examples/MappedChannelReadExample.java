package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelReadExample {

    public static String path = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get(path))){
            long fSize = fileChannel.size();
            MappedByteBuffer mBuf = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)mBuf.get());
            }
        }
    }
}
