package web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIsSocketExample {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("whois.internic.net", 43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = "ya.ru\n";
        out.write(str.getBytes());
        int c;
        while((c=in.read())!= -1){
            System.out.print((char)c);
        }
        s.close();
    }
}
