package poio.examples;

import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {
        Console con = System.console();
        if(con != null){
            String str = con.readLine("Insert string: ");
            con.printf("You inserted: " + str);
        }
    }
}
