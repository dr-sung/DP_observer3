
import java.util.ArrayList;

/*
 * Participant: ConcreteSubject
 */

public class BossLevel1 implements Subject {
    
    private ArrayList<Observer> observers;
    
    public BossLevel1() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(new Event("Boss at Level 1 is killed!", 10, this));
        }
    }
    
}
