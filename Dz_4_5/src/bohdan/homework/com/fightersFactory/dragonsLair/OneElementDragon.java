package bohdan.homework.com.fightersFactory.dragonsLair;


import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourElement;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class OneElementDragon implements DragonsFactory {

    private boolean isOneElementDragon;

    public OneElementDragon(boolean isOneElementDragon) {
        this.isOneElementDragon = isOneElementDragon;
    }

    @Override
    public Dragon createDragon() {
        if(isOneElementDragon) lowDragon();
        return usualDragon();
    }

    private Dragon lowDragon() {
        return new Dragon("Low Dragon", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor(), new YourElement().randomOneElement());
    }
}
