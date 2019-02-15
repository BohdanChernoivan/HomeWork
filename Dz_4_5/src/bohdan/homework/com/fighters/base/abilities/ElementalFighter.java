package bohdan.homework.com.fighters.base.abilities;


public interface ElementalFighter {

    int fire = 0b0001;
    int water = 0b0010;
    int earth = 0b0100;
    int air = 0b1000;
    int elements[] = {fire, water, earth, air};
    /**
     * @return return element mask
     */
    int getElement();

    default int getСomparisonElementEnemy(int element) { return element; }
    default boolean getCoincideElement(int element) {return false;}
}

