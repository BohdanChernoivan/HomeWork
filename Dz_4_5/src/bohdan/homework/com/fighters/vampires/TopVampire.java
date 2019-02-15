package bohdan.homework.com.fighters.vampires;

import bohdan.homework.com.fighters.base.abilities.ElementalFighter;
import bohdan.homework.com.fighters.base.actions.ReturnMyDamage;
import bohdan.homework.com.fighters.base.actions.ActionPreFight;
import bohdan.homework.com.fighters.base.ArenaFighter;

import java.util.Random;

public class TopVampire extends Vampire implements ActionPreFight, ElementalFighter, ReturnMyDamage {

    Random random = new Random();

    private int getRandomElement() {
        return elements[random.nextInt(elements.length)];

        }

    public TopVampire(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }

    @Override
    public int getElement() {
        return getRandomElement();
    }



    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {


            int thisFighterDamage = getDamageVampirism(this,arenaFighter);
        try {
            setHealth(thisFighterDamage);
            setDamage(thisFighterDamage / 2);

            arenaFighter.takeDamage(getDamage() * bonusDamage(arenaFighter));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }


        switch (getElement()) {
            case 1:
                System.out.println(getName() + " get fire." );
                break;
            case 2:
                System.out.println(getName() + " get water.");
                break;
            case 4:
                System.out.println(getName() + " get earth.");
                break;
            case 8:
                System.out.println(getName() + " get air.");
                break;
        }
    }

    private int bonusDamage(ArenaFighter arenaFighter) {
        return getСomparisonElementEnemy(arenaFighter instanceof ElementalFighter ? (((ElementalFighter)arenaFighter).getElement()) : 1);
    }


    public int getСomparisonElementEnemy(int element) {
        int defaultElement = getElement() ^ element;
        int tempDefaultElement = ~defaultElement;
        int reversElements = tempDefaultElement | element;
        int sumElements = ~ reversElements;
        int count = 1;
        for (int e : elements) {
            count += (sumElements & e) > 0 ? 2 : 0;
        }
        return count;
    }
}
