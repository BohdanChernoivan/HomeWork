package bohdan.homework.com.fightersFactory;

import bohdan.homework.com.fighters.base.ArenaFighter;

public interface FightersFactory {
    ArenaFighter createFighter(FighterType fighterType);

}
