package bohdan.homework.com.Fighters.Base.Actions;

import bohdan.homework.com.Fighters.Base.ArenaFighter;

public interface ActionPostFight {
    void action(ArenaFighter arenaFighter, int takeDamage);

    interface finishCallBack {
        void inTheTrash(ArenaFighter arenaFighter);
    }
}

