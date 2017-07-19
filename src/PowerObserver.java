/*
 * Participant: ConcreteObserver
 */

public class PowerObserver implements Observer {

    @Override
    public void update(Event e) {
        System.out.println("Power changes: " + e.getValue());
    }
    
}
