package tennisOrganization.league.type;


public class Bronze extends AbstractLeague {

    private int points = 3;
    private String name = "Bronze";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
