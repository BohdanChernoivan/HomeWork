package bohdan.homework.com.Fighters.Riders;


import bohdan.homework.com.Fighters.Base.Actions.FightBreakAction;
import bohdan.homework.com.Fighters.Base.ArenaFighter;
import bohdan.homework.com.Fighters.Dragons.Dragon;



public class DragonRider extends ArenaFighter implements FightBreakAction {

    private Dragon dragonPet = null;

    public DragonRider(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter, FightCallBack fightCallBack) {
        if (arenaFighter instanceof Dragon) {
            dragonPet = (Dragon) arenaFighter;
            setDamage(dragonPet.getDamage());
            fightCallBack.fightImmediatelyDone(this);
        }
    }

//    @Override
//    public int setReturnDamage(int damage) {
//        return super.setReturnDamage(damage + dragonPet.getFullDamage());
//    }
}





