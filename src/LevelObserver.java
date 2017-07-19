/*
 * Participant: ConcreteObserver
 */
public class LevelObserver implements Observer {

    @Override
    public void update(Event e) {
        System.out.println(e.getMessage());
        if (e.getSubject() instanceof BossLevel2) {
            System.out.println("You are moving to Level 3!");
        }
    }

}
