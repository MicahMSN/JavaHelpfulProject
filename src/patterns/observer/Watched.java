package patterns.observer;

import java.util.Observable;

public class Watched extends Observable {
    void couter(int period){
        while(period>=0){
            setChanged();
            notifyObservers(period);
            try{
                Thread.sleep(period);
                System.out.println("...sleeped");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            period--;
        }
    }
}
