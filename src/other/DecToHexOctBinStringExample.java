package other;

public class DecToHexOctBinStringExample {
    public static void main(String[] args) {
        int value = 1513;
        System.out.println("DEC: " + value);
        System.out.println("BIN: " + Integer.toBinaryString(value));
        System.out.println("OCT: " + Integer.toOctalString(value));
        System.out.println("HEX: " + Integer.toHexString(value));
    }
}
