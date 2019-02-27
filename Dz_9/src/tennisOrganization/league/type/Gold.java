package tennisOrganization.league.type;


public class Gold extends AbstractLeague {

    private int points = 7;
    private String name = "Gold";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
