package bohdan.homework.com.Fighters.Knights;

import bohdan.homework.com.Fighters.Base.Actions.ActionPreFight;
import bohdan.homework.com.Fighters.Base.ArenaFighter;

public class HolyKnight extends Knight implements ActionPreFight {

    private int regenerationHealth;

    public HolyKnight(String name, int health, int damage, double defense, double shield, int regenerationHealth) {
        super(name, health, damage, defense, shield);
        this.regenerationHealth = regenerationHealth;
    }

    private int getRegenerationHealth() {
        return regenerationHealth;
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter) {
        setHealth(getRegenerationHealth());
        if(getHealth() > getFullHP()) {
            setRegenHealth(getFullHP());
        }
    }
}
