package bohdan.homework.com.fighters.riders;


import bohdan.homework.com.fighters.base.actions.FightBreakAction;
import bohdan.homework.com.fighters.base.ArenaFighter;
import bohdan.homework.com.fighters.dragons.Dragon;



public class DragonRider extends ArenaFighter implements FightBreakAction {

    private Dragon dragonPet = null;

    public DragonRider(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }

    @Override
    public void actionWithFight(ArenaFighter arenaFighter, FightCallBack fightCallBack) {
        if (arenaFighter instanceof Dragon) {
            System.out.println(this.getName() + " grab " + arenaFighter.getName());
            try {
            dragonPet = (Dragon) arenaFighter;
            setDamage(dragonPet.getDamage());
                fightCallBack.fightImmediatelyDone(this);
            } catch (Exception e) {
                System.out.println("Dragon Pet don't find");
            }
        }
    }

//    @Override
//    public int setReturnDamage(int damage) {
//        return super.setReturnDamage(damage + dragonPet.getFullDamage());
//    }
}





