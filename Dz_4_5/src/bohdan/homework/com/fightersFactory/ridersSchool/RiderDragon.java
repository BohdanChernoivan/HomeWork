package bohdan.homework.com.fightersFactory.ridersSchool;

import bohdan.homework.com.fighters.riders.DragonRider;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;


public class RiderDragon implements RidersFactory {

    private boolean isRiderDragon;

    public RiderDragon(boolean isRiderDragon) {
        this.isRiderDragon = isRiderDragon;
    }

    @Override
    public DragonRider createDragonRider() {
        if (isRiderDragon) return dragonRider();
        else return usualRider();
    }

    private DragonRider dragonRider() {
        return new DragonRider("Dragon Rider", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor());
    }
}
