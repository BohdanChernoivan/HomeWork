package bohdan.homework.com.fightersFactory;

import bohdan.homework.com.fighters.base.ArenaFighter;
import bohdan.homework.com.fighters.dragons.Dragon;
import bohdan.homework.com.fighters.vampires.TopVampire;
import bohdan.homework.com.fightersFactory.dragonsLair.DragonsFactory;
import bohdan.homework.com.fightersFactory.dragonsLair.OneElementDragon;
import bohdan.homework.com.fightersFactory.elementNatural.ElementsFactory;
import bohdan.homework.com.fightersFactory.knightsCaslte.DarkCastle;
import bohdan.homework.com.fightersFactory.knightsCaslte.HolyCastle;
import bohdan.homework.com.fightersFactory.knightsCaslte.KnightsFactory;
import bohdan.homework.com.fightersFactory.ridersSchool.RiderDragon;
import bohdan.homework.com.fightersFactory.ridersSchool.RidersFactory;
import bohdan.homework.com.fightersFactory.vampiresCemetery.GreatVampire;
import bohdan.homework.com.fightersFactory.vampiresCemetery.VampiresFactory;

public class FighersLowFactory implements FightersFactory {

    DragonsFactory dragonsFactory;
    KnightsFactory knightsFactory;
    RidersFactory ridersFactory;
    VampiresFactory vampiresFactory;
    ElementsFactory elementsFactory;

    Dragon dragon;
    FighersLowFactory(){
        dragonsFactory = new OneElementDragon(false);
        knightsFactory = new HolyCastle(true);
        knightsFactory = new DarkCastle(true);
        ridersFactory = new RiderDragon(true);
        vampiresFactory = new GreatVampire(true);
    }

    @Override
    public ArenaFighter createFighter(FighterType fighterType) {

        switch (fighterType) {

            case Dragon:
                return dragonsFactory.createDragon();
            case Knight:
                return knightsFactory.createKnight();
            case DragonRider:
                return ridersFactory.createDragonRider();
            case Vampire:
                return vampiresFactory.createVampire();
            case Elemental:
                return elementsFactory.createElemental();
            case Random:
                break;
        }
        return null;

    }
}
