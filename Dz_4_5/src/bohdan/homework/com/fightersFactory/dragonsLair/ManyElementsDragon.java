package bohdan.homework.com.fightersFactory.dragonsLair;

import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourElement;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class ManyElementsDragon implements DragonsFactory {


    private boolean isManyElementsDragon;


    public ManyElementsDragon(boolean isManyElementsDragon) {
        this.isManyElementsDragon = isManyElementsDragon;
    }

    @Override
    public Dragon createDragon() {
        if (isManyElementsDragon) return GreatDragon();
        return GreatDragon();
    }

    private Dragon GreatDragon() {
        return new Dragon("Great Dragon", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor(), new YourElement().randomManyElements());
    }
}
