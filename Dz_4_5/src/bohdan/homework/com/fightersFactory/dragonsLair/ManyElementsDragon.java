package bohdan.homework.com.fightersFactory.dragonsLair;

import bohdan.homework.com.fighters.base.abilities.ElementalFighter;
import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourElement;

public class ManyElementsDragons implements DragonsFactory {

    ElementalFighter elementalFighter;

    public ManyElementsDragons(ElementalFighter elementalFighter) {
        this.elementalFighter = elementalFighter;
    }

    @Override
    public Dragon createDragon() {
        return GreatDragon();
    }

    private Dragon GreatDragon() { return new Dragon("GreatDragon", 120,20,0.2, new YourElement().randomManyElements());
    }
}
