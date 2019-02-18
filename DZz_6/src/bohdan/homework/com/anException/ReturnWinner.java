package bohdan.homework.com.anException;

import bohdan.homework.com.fighters.base.ArenaFighter;

public class ReturnWinner extends Exception {

    private ArenaFighter fighterWinner;

    public ReturnWinner(ArenaFighter fighterWinner) {
        this.fighterWinner = fighterWinner;
    }

    public ArenaFighter getFighterWinner() {
        return fighterWinner;
    }
}

