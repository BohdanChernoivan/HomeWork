package bohdan.homework.com.fightersFactory.elementNatural;

import bohdan.homework.com.fighters.elementals.Elemental;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourElement;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public interface ElementsFactory {
    Elemental createElemental();
    default Elemental usualElemental() {
        return new Elemental("Elemental", new YourHealth().returnHealth(),new YourDamage().returnDamage(), new YourArmor().returArmor(), new YourElement().randomOneElement());
    }
}
