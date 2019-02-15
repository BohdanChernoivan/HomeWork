package bohdan.homework.com;

import bohdan.homework.com.arena.Arena;
import bohdan.homework.com.arena.Tourney;
import bohdan.homework.com.fighters.base.ArenaFighter;
import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fighters.elementals.Elemental;
import bohdan.homework.com.fighters.knights.DarkKnight;
import bohdan.homework.com.fighters.knights.HolyKnight;
import bohdan.homework.com.fighters.knights.Knight;
import bohdan.homework.com.fighters.riders.DragonRider;
import bohdan.homework.com.fighters.vampires.TopVampire;
import bohdan.homework.com.fighters.vampires.Vampire;


public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena();

        Tourney tourney = new Tourney();

        Dragon dragon = new Dragon("Dragon", 550, 75, 0.4, Dragon.earth);
        Knight knight = new Knight("Knight", 450, 68, 0.3, 0.6);
        HolyKnight holyKnight = new HolyKnight("Holy Knight", 390, 65, 0.0, 0.5, 21);
        DarkKnight darkKnight = new DarkKnight("Dark Knight", 420, 71, 0.4, 0.2);
        DragonRider dragonRider = new DragonRider("Dragon Rider", 350, 85, 0.6);
        Vampire vampire = new Vampire("Vampire", 290, 30, 0.2);
        TopVampire topVampire = new TopVampire("Top Vampire", 330, 35, 0.3);
        Elemental elemental = new Elemental("Elemental", 470, 78, 0.3, Elemental.earth);

        ArenaFighter fighters[] = {dragon, knight, holyKnight, darkKnight, dragonRider, vampire, topVampire, elemental};
        tourney.setPvp(fighters);

//        arena.fight(elemental,holyKnight);
//        arena.fight(topVampire,dragonRider);
//        arena.fight(dragon,dragonRider);
//        arena.fight(topVampire,vampire);

    }
}