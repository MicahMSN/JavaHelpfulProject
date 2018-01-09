package web;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.internic.net");
        URLConnection urlCon = url.openConnection();
        long d = urlCon .getDate();
        System.out.println(d==0?"No date average": "Date: "+new Date(d));
        System.out.println("Content Type: "+ urlCon.getContentType());
        d = urlCon.getLastModified();
        System.out.println("Last Modified date: " + ((d == 0)? "no average": new Date(d)));
        System.out.println("Content lenght: "+urlCon.getContentLength());
    }
}
