package bohdan.homework.com.anException;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class MyException extends Exception {

    private ArenaFighter arenaFighter;

    public MyException(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo) {
        ArenaFighter winner;
        if(0.5 > Math.random()) { winner = arenaFighterOne;}
        else winner = arenaFighterTwo;
        this.arenaFighter = winner;
    }

    public ArenaFighter getWinner() {
        return arenaFighter;
    }
}