package nio.examples;

import lautil.ELConstants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathExample {

    public static String path = ELConstants.FILE_READ_PATH;

    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get(path);
        System.out.println("File name: " + filepath.getName(1));
        System.out.println("Filepath: " + filepath);
        System.out.println("Absolute filepath: " + filepath.toAbsolutePath());
        System.out.println("Parent: " + filepath.getParent());
        System.out.println("File exist?: " + Files.exists(filepath));               //!!!-file system state can be changed after this call
        System.out.println("File is hidden?: " + Files.isHidden(filepath));
        System.out.println("File is writtable?: " + Files.isWritable(filepath));    //!!!
        System.out.println("File is readable?: " + Files.isReadable(filepath));     //!!!
        System.out.println("File is executable?: " + Files.isExecutable(filepath)); //!!!

        System.out.println("================================================");
        System.out.println("ATTRIBUTES:");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(filepath, BasicFileAttributes.class);
        System.out.println("Directory?: " + basicFileAttributes.isDirectory()); //!!!
        System.out.println("Regular simple file?: " + basicFileAttributes.isRegularFile()); //!!!
        System.out.println("Symbolic link?: " + basicFileAttributes.isSymbolicLink()); //!!!
        System.out.println("Last modified: " + basicFileAttributes.lastModifiedTime()); //!!!
        System.out.println("Size [bytes]: " + basicFileAttributes.size()); //!!!
    }
}
