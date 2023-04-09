public class Match {
    private String homeTeam;
    private String awayTeam;

    public Match(String homeTeam, String awayTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
