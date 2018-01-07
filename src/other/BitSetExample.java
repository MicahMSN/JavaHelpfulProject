package other;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args) {
        BitSet A = new BitSet(16);
        BitSet B = new BitSet(16);
        for (int i = 0; i < 16; i++) {
            if((i % 2) == 0)
                A.set(i);
            if((i % 5) != 0)
                B.set(i);
        }
        System.out.println("Start A:" + A);
        System.out.println("Start B:" + B);
        B.and(A);
        System.out.println("A AND B:" + B);
        B.or(A);
        System.out.println("A OR (A AND B):" + B);
        B.xor(A);
        System.out.println("A XOR (A OR (A AND B)):" + B);
    }
}
