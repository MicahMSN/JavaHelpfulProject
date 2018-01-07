package patterns.observer;

public class ObserverExample {

    public static void main(String[] args) {
        Watched observed = new Watched();
        Watcher observing = new Watcher();
        observed.addObserver(observing);
        observed.couter(10);
    }
}
