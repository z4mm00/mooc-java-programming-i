public class Team {
    private String name;
    private int gamesPlayed;
    private int gamesLost;
    private int gamesWon;

    public Team(String teamName) {
        this.name = teamName;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
    }

    public String getTeamName() {
        return name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesPlayed() {
        gamesPlayed = gamesWon + gamesLost;
        return gamesPlayed;
    }

    public void updateGamesWon() {
        gamesWon++;
    }

    public void updateGamesLost() {
        gamesLost++;
    }
}