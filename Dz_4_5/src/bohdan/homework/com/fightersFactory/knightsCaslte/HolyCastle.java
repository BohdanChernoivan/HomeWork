package bohdan.homework.com.fightersFactory.knightsCaslte;

import bohdan.homework.com.fighters.knights.HolyKnight;
import bohdan.homework.com.fighters.knights.Knight;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourArmor;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourDamage;
import bohdan.homework.com.fightersFactory.randomСharacteristics.YourHealth;

public class HolyCastle implements KnightsFactory {

    private boolean isHolyKnight;

    public HolyCastle(boolean isHolyKnight) {
        this.isHolyKnight = isHolyKnight;
    }

    @Override
    public Knight createKnight() {
        if(isHolyKnight) return usualHolyKnight();
        else return usualKnight();
    }

    private Knight usualHolyKnight() {
        return new HolyKnight("HollyKnight", new YourHealth().returnGreatHealth(), new YourDamage().returnGreatDamage(), new YourArmor().returArmor(),0.3, 15);
    }
}
