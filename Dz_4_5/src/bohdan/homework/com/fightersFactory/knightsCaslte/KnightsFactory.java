package bohdan.homework.com.fightersFactory.knightsCaslte;

import bohdan.homework.com.fighters.knights.Knight;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public interface KnightsFactory {
    Knight createKnight();
    default Knight usualKnight() {
        return new Knight("Knight", new YourHealth().returnHealth(),new YourDamage().returnDamage(), new YourArmor().returArmor(), 0.5);
    }
}
