package other;

public class InfiniteExample {

    public static void main(String[] args) {
        Double d1 = 1.0/0.0;
        Double d2 = 0.0/0.0;
        System.out.println(d1 + ": is infinite? - [" + d1.isInfinite() + "]. Is Not a Number? - [" + d1.isNaN()+"]");
        System.out.println(d2 + ": is infinite? - [" + d2.isInfinite() + "]. Is Not a Number? - [" + d2.isNaN()+"]");
    }
}
