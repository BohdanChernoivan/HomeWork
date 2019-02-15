package bohdan.homework.com.fightersFactory.elementNatural;

import bohdan.homework.com.fighters.elementals.Elemental;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourElement;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class GreatElement implements ElementsFactory {

    private boolean isGreatElement;

    public GreatElement(boolean isGreatElement) {
        this.isGreatElement = isGreatElement;
    }

    @Override
    public Elemental createElemental() {
        if(isGreatElement) return usualGreatElement();
        return usualElemental();
    }

    private Elemental usualGreatElement() {
        return new Elemental("Great Elemental", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor(),new YourElement().randomOneElement());
    }

}
