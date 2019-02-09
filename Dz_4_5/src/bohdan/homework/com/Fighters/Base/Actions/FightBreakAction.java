package bohdan.homework.com.Fighters.Base.Actions;

import bohdan.homework.com.Fighters.Base.ArenaFighter;

public interface FightBreakAction {
    void actionWithFight(ArenaFighter arenaFighter, FightCallBack callBack);

    interface FightCallBack {
        void fightImmediatelyDone(ArenaFighter winner);
    }
}
