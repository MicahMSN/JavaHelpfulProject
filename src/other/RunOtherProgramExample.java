package other;

public class RunOtherProgramExample {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p=r.exec("calc");
        } catch (Exception e){
            System.out.println("Err");
        }
    }
}
