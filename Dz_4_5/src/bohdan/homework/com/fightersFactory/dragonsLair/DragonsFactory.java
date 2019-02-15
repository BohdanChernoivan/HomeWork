package bohdan.homework.com.fightersFactory.dragonsLair;

import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public interface DragonsFactory {
    Dragon createDragon();
    default Dragon usualDragon() {
        return new Dragon("Dragon", new YourHealth().returnHealth(),new YourDamage().returnDamage(), new YourArmor().returArmor(), 0);
    }
}
