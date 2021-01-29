
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        ArrayList<Team> teams = getGamesFromFile(fileName);
        teamToPrint(teamName, teams);
    }


    public static ArrayList<Team> getGamesFromFile(String fileName) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);

                if (!teamExists(homeTeam, teams)) {
                    teams.add(new Team(homeTeam));
                }

                if (!teamExists(awayTeam, teams)) {
                    teams.add(new Team(awayTeam));
                }

                if (homePoints > awayPoints){
                    gameResults(homeTeam, awayTeam, teams);
                } else {
                    gameResults(awayTeam, homeTeam, teams);
                }
            }
        } catch (Exception e) {
            System.out.println("Error with file: " + e.getMessage());
        }
        return teams;
    }


    public static void teamToPrint (String teamName, ArrayList<Team> teams) {
        if (!teamExists(teamName,teams)) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Looses: 0");
        } else {
            for (Team team :teams) {
                if (team.getTeamName().equals(teamName)) {
                    System.out.println("Games: " + team.getGamesPlayed());
                    System.out.println("Wins: " + team.getGamesWon());
                    System.out.println("Looses: " + team.getGamesLost());
                }
            }
        }
    }


    public static boolean teamExists(String teamName, ArrayList<Team> teams) {
        for (Team team : teams) {
            if(team.getTeamName().equals(teamName)) {
                return true;
            }
        }
        return false;
    }


    public static void gameResults(String winner, String loser, ArrayList<Team> teams) {
        for (Team team : teams) {
            if (team.getTeamName().equals(winner)) {
                team.updateGamesWon();
            }
            if (team.getTeamName().equals(loser)) {
                team.updateGamesLost();
            }
        }

    }
}
