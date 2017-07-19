/*
 * Observer pattern
 */

public class Main {

    public static void main(String[] args) {

        Subject b1_1 = new BossLevel1();
        Subject b1_2 = new BossLevel1(); // two bosses at level 1

        Subject b2 = new BossLevel2(); // one boss at level 2

        Observer o1 = new LevelObserver();
        Observer o2 = new PowerObserver();

        b1_1.addObserver(o1);
        b1_2.addObserver(o1);
        b2.addObserver(o1);
        b2.addObserver(o2);

        b1_1.notifyObservers();
        b1_2.notifyObservers();
        b2.notifyObservers();

    }

}
