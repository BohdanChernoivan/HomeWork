package bohdan.homework.com.Fighters.Riders;


import bohdan.homework.com.Fighters.Base.ArenaFighter;
import bohdan.homework.com.Fighters.Dragons.Dragon;
import bohdan.homework.com.Fighters.Riders.DragonPet.DragonPet;


public class DragonRider extends ArenaFighter implements DragonPet{ //TODO: not over yet

    private Dragon dragonPet = null;

    public DragonRider(String name, int health, int damage, double defense) {
        super(name, health, damage, defense);
    }


    public void dragonPET(Dragon dragon) {
            dragonPet = dragon;
            setDamage(dragonPet.getDamage());
    }
}




/*    public void countHealth() {
        setHealth(getHealth() + dragonPet.getHealth());
    }

    public void countDamage() {
        setDamage(getDamage() + dragonPet.getDamage());
    }

    private boolean isDragonAlive() {
        if (dragonPet.getHealth() >= dragonPet.getFullHP()) {
            return true;
        } else return false;
    }
    */

// if(arenaFighter instanceof Dragon)
//    public void doActionBeforeFight(ArenaFighter arenaFighter) {
//        if (arenaFighter instanceof Dragon) {
//            dragonPet = (Dragon) arenaFighter;
//        }
//        super.damageArenaFighter(arenaFighter);
//    }



