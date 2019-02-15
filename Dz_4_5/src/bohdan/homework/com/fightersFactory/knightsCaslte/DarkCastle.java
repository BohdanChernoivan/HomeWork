package bohdan.homework.com.fightersFactory.knightsCaslte;

import bohdan.homework.com.fighters.knights.DarkKnight;
import bohdan.homework.com.fighters.knights.Knight;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class DarkCastle implements KnightsFactory {

    private boolean isDarkCastle;

    public DarkCastle(boolean isDarkCastle) {
        this.isDarkCastle = isDarkCastle;
    }

    @Override
    public Knight createKnight() {
        if(isDarkCastle) return usualDarkKnight();
        else return usualKnight();
    }

    private Knight usualDarkKnight() {
        return new DarkKnight("Dark Knight", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor(), 0.3);
    }
}
