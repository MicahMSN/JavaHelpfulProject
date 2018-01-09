package web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println("Request method: " + con.getRequestMethod());
        System.out.println("Response code: " + con.getResponseCode());
        System.out.println("Response message: " + con.getResponseMessage());
        Map<String, List<String>> headers = con.getHeaderFields();
        System.out.println("Headers: ");
        for(Map.Entry<String, List<String>> pair: headers.entrySet()){
            System.out.println(pair.toString());
        }
    }
}
