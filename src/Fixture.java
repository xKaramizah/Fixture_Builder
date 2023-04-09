import java.util.*;

public class Fixture {
    private List<String> teams;

    public Fixture(List<String> teams) {
        this.teams = teams;
    }

    public void buildFixtures() {
        int numTeams = teams.size();
        if (numTeams % 2 != 0) {
            teams.add("Bay");
            numTeams++;
        }

        int numRounds = numTeams - 1;
        int numMatchesPerRound = numTeams / 2;

        Collections.shuffle(teams);
        List<String[]> fixtures = new ArrayList<>();
        for (int i = 0; i < numRounds; i++) {
            String[] round = new String[numMatchesPerRound];
            for (int j = 0; j < numMatchesPerRound; j++) {
                int homeIndex = (i + j) % (numTeams - 1);
                int awayIndex = (numTeams - 1 - j + i) % (numTeams - 1);
                if (j == 0) {
                    awayIndex = numTeams - 1;
                }
                round[j] = teams.get(homeIndex) + " vs " + teams.get(awayIndex);
            }
            fixtures.add(round);
        }

        System.out.println("1. Season:");
        for (int i = 0; i < numRounds; i++) {
            System.out.println("Round " + (i + 1));
            for (String match : fixtures.get(i)) {
                String[] teams = match.split(" vs ");
                System.out.println(teams[0] + " vs " + teams[1]);
            }
            System.out.println();
        }

        System.out.println("2. Season:");
        for (int i = 0; i < numRounds; i++) {
            System.out.println("Round " + (i + 1));
            for (String match : fixtures.get(i)) {
                String[] teams = match.split(" vs ");
                System.out.println(teams[1] + " vs " + teams[0]);
            }
            System.out.println();
        }
    }
}