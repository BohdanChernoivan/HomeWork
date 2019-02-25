package tennisOrganization.players;

public class Player {
    private String name;
    private int age;
    private int point;
    private int skillPlayTennis;
    private String league;

    public Player() {
        this.name = new Generation().getName();
        this.age = new Generation().getAge();
        this.skillPlayTennis = new Generation().getSkillPlay();
        this.point = this.getPoint();
        this.league = this.getLeague();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getSkillPlayTennis() {
        return skillPlayTennis;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public int hashCode() {
        return getSkillPlayTennis();
    }
}
