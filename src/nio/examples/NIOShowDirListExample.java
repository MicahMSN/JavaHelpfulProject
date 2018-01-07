package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOShowDirListExample {
    public static final String dir = ELConstants.GLOBAL_PATH;

    public static void main(String[] args) throws IOException {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dir), (Path p)-> p.getName(1).toString().endsWith(".txt"))) {
            System.out.println("Directory: " + dir);
            for (Path p : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(p, BasicFileAttributes.class);
                System.out.println(attributes.isDirectory() ? "<DIR> " + p.getName(1) : p.getFileName());
            }
        }
    }
}
