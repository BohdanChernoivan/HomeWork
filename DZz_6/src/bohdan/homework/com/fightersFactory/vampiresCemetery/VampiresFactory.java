package bohdan.homework.com.fightersFactory.vampiresCemetery;

import bohdan.homework.com.fighters.vampires.Vampire;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public interface VampiresFactory {
    Vampire createVampire();
    default Vampire usualVampire() {
        return new Vampire("Vampire", new YourHealth().returnHealth(),new YourDamage().returnDamage(), new YourArmor().returArmor());
    }
}
