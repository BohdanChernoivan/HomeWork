package bohdan.homework.com.fighters.knights;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class Knight extends ArenaFighter {

    private double shield;


    public Knight(String name, int health, int damage, double defense, double shield) {
        super(name, health, damage, defense);
        this.shield = shield;
    }

    public double getShield() {
        return shield;
    }


    @Override
    public int takeDamage(int damage) {
        if (Math.random() > getShield())
            return super.takeDamage(damage);
        else return 0;
    }
}
