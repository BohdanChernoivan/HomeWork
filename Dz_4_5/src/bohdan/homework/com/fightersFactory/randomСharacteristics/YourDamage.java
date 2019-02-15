package bohdan.homework.com.fightersFactory.randomСharacteristics;

public class YourDamage{

    public int returnDamage() {
            int dmg = 15 + (int)(Math.random() * (25 - 15));
            return dmg;
    }

    public int returnGreatDamage() {
        int dmg = 25 + (int)(Math.random() *(40 - 25));
        return dmg;
    }
}
