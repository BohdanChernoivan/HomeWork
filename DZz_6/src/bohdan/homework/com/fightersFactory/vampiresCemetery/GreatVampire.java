package bohdan.homework.com.fightersFactory.vampiresCemetery;

import bohdan.homework.com.fighters.vampires.TopVampire;
import bohdan.homework.com.fighters.vampires.Vampire;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class GreatVampire implements VampiresFactory {

    private boolean isTopVampire;

    public GreatVampire(boolean isTopVampire) {
        this.isTopVampire = isTopVampire;
    }

    @Override
    public Vampire createVampire() {
        if(isTopVampire) return usualTopVampire();
        else return usualVampire();
    }

    private TopVampire usualTopVampire() {
        return new TopVampire("Top Vampire",  new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor());
    }
}
