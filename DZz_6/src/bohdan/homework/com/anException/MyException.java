package bohdan.homework.com.anException;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class MyException extends Exception {

    ArenaFighter arenaFighter;

    public MyException(ArenaFighter arenaFighterOne, ArenaFighter arenaFighterTwo) {
        ArenaFighter winner;
        double win = Math.random();
        if(0.5 > win) { winner = arenaFighterOne;}
        else winner = arenaFighterTwo;
        arenaFighter = winner;
    }

    public ArenaFighter getWinner() {
        return arenaFighter;
    }
}