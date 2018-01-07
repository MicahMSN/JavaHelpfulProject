package serialization;

import java.io.Serializable;

public class SerialClass implements Serializable {
    String s;
    int i;
    double d;

    public SerialClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "SerialClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
