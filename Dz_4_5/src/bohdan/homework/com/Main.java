package bohdan.homework.com;

import bohdan.homework.com.Arena.Arena;
import bohdan.homework.com.Arena.Tourney;
import bohdan.homework.com.Fighters.Base.ArenaFighter;
import bohdan.homework.com.Fighters.Dragons.Dragon;
import bohdan.homework.com.Fighters.Elementals.Elemental;
import bohdan.homework.com.Fighters.Knights.DarkKnight;
import bohdan.homework.com.Fighters.Knights.HolyKnight;
import bohdan.homework.com.Fighters.Knights.Knight;
import bohdan.homework.com.Fighters.Riders.DragonRider;
import bohdan.homework.com.Fighters.Vampires.TopVampire;
import bohdan.homework.com.Fighters.Vampires.Vampire;


public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena();

        Tourney tourney = new Tourney();

        Dragon dragon = new Dragon("Dragon", 550, 75, 0.4, Dragon.earth | Dragon.fire);
        Knight knight = new Knight("Knight", 450, 68, 0.3, 0.6);
        HolyKnight holyKnight = new HolyKnight("Holy Knight", 390, 65, 0.3, 0.3, 21);
        DarkKnight darkKnight = new DarkKnight("Dark Knight", 420, 71, 0.4, 0.2);
        DragonRider dragonRider = new DragonRider("Dragon Rider", 350, 85, 0.6);
        Vampire vampire = new Vampire("Vampire", 290, 30, 0.2);
        TopVampire topVampire = new TopVampire("Top Vampire", 330, 35, 0.3);
        Elemental elemental = new Elemental("Elemental", 470, 78, 0.3, Elemental.earth);

        ArenaFighter fighters[] = {dragon, knight, holyKnight, darkKnight, dragonRider, vampire, topVampire, elemental};

        arena.fight(dragon,topVampire);
        arena.fight(dragonRider,vampire);
        arena.fight(dragon,dragonRider);
        arena.fight(topVampire,vampire);
    }
}
