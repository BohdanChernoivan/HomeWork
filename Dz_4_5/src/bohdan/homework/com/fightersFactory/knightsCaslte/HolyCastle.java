package bohdan.homework.com.fightersFactory.knightsCaslte;

import bohdan.homework.com.fighters.knights.HolyKnight;
import bohdan.homework.com.fighters.knights.Knight;

public class HollyCastle implements KnightsFactory {

    private boolean isHollyKnight;

    public HollyCastle(boolean isHollyKnight) {
        this.isHollyKnight = isHollyKnight;
    }

    @Override
    public Knight createKnight() {
        if(isHollyKnight) return usualHollyKnight();
        return usualKnight();
    }

    private Knight usualHollyKnight() {
        return new HolyKnight("HollyKnight", 110, 15,0.5,0.3, 15);
    }
}
