package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Watcher's update method called" + arg);
    }
}
