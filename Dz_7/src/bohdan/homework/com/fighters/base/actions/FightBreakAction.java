package bohdan.homework.com.fighters.base.actions;

import bohdan.homework.com.fighters.base.ArenaFighter;

public interface FightBreakAction {
    void actionWithFight(ArenaFighter arenaFighter, FightCallBack callBack);

    interface FightCallBack {
        void fightImmediatelyDone(ArenaFighter winner);
    }
}
