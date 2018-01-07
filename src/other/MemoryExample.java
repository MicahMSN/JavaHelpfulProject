package other;

public class MemoryExample {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] arr = new Integer[1499999];
        System.out.println("Total memory: " + r.totalMemory());
        System.out.println("Free memory at beginning: " + r.freeMemory());
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after gc: " + mem1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        mem2 = r.freeMemory();
        System.out.println("Free memory after objects created: "+ mem2);
        System.out.println("Used memory: " + (mem1-mem2));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        r.gc();
        System.out.println("Now free memory: " + r.freeMemory());
    }
}
