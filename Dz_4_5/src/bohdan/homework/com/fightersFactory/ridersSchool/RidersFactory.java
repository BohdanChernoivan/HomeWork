package bohdan.homework.com.fightersFactory.ridersSchool;

import bohdan.homework.com.fighters.riders.DragonRider;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public interface RidersFactory {
    DragonRider createDragonRider();
    default DragonRider usualRider() {
        return new DragonRider("Rider", new YourHealth().returnHealth(),new YourDamage().returnDamage(), new YourArmor().returArmor());
    }
}
