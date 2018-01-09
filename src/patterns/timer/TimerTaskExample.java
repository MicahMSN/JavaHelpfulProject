package patterns.timer;

import java.util.Timer;

public class TimerTaskExample {
    public static void main(String[] args) {
        ELTimerTask myTask = new ELTimerTask();
        Timer timer = new Timer();
        timer.schedule(myTask, 1000, 500);
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
