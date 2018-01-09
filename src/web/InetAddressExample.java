package web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.yandex.ru");
        System.out.println(address);
        System.out.println(".....");
        InetAddress arr[] = InetAddress.getAllByName("www.yandex.ru");
        for(InetAddress a: arr){
            System.out.println(a);
        }
    }
}
