package bohdan.homework.com.fighters.base.actions;

import bohdan.homework.com.fighters.base.ArenaFighter;

public interface ActionPostFight {
    void action(ArenaFighter arenaFighter, int takeDamage);

    interface finishCallBack {
        void inTheTrash(ArenaFighter arenaFighter);
    }
}

