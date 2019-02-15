package bohdan.homework.com.fightersFactory.randomСharacteristics;

public class YourHealth {

    public int returnHealth() {
        int hp = 100 + (int)(Math.random() * (200 - 100));
        return hp;
    }

    public int returnGreatHealth() {
        int hp = 200 + (int)(Math.random() * (350 - 200));
        return hp;
    }
}
