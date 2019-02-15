package bohdan.homework.com.fightersFactory.dragonsLair;

import bohdan.homework.com.fighters.base.abilities.ElementalFighter;
import bohdan.homework.com.fighters.dragons.Dragon;

public class OneElementDragonsLair implements DragonsFactory {

    ElementalFighter elementalFighter;
    boolean isGreat;

    public OneElementDragonsLair(ElementalFighter elementalFighter, boolean isGreat) {
        this.elementalFighter = elementalFighter;
        this.isGreat = isGreat;
    }

    @Override
    public Dragon createDragon() {
        return GreatDragon();
//        if (isGreat)
    }

    public Dragon GreatDragon() {
        return new Dragon("Dragon", 100,20,0.5, elementalFighter.getElement());
    }
}
