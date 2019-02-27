package tennisOrganization.league.type;


public class Silver extends AbstractLeague{

    private int points = 5;
    private String name = "Silver";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
