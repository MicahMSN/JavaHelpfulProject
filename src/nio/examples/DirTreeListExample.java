package nio.examples;

import nio.ELFileVisitor;
import lautil.ELConstants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeListExample {

    public static final String path = ELConstants.GLOBAL_PATH;

    public static void main(String[] args) throws IOException {
        System.out.println("Tree folder: ");
        Files.walkFileTree(Paths.get(path), new ELFileVisitor<>());
    }
}
