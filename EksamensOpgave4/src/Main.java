import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Player player1 = new StandardPlayer("Karl");
        Player player2 = new StandardPlayer("Carl");
        Player player3 = new JuniorPlayer("Daryl");
        Player player4 = new JuniorPlayer("Daniel");

        ArrayList<Player> teamPlayers = new ArrayList<>();
        teamPlayers.add(player1);
        teamPlayers.add(player2);
        teamPlayers.add(player3);
        teamPlayers.add(player4);

        Team team = new Team("Team Giganter", teamPlayers);

        player1.addPoints(1000);
        player2.addPoints(1000);
        player3.addPoints(1000);
        player4.addPoints(1000);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        double pointsDistribution = team.getPoint();
        System.out.println(team);
        System.out.println("Each team member receives: " + team.addPoints(pointsDistribution) + " points.");


    }
}