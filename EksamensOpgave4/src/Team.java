import java.util.ArrayList;

public class Team implements Player{

    private String name;
    private ArrayList<Player> players;

    public Team (String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }
    @Override
    public double getPoint() {
        double totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoint();
        }
        return totalPoints;
    }

    @Override
    public double addPoints(double points) {
        double playerPoints = points / players.size();
        for (Player player : players) {
            player.addPoints(playerPoints);
        }
        return playerPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Team name : " + getName() + ", Points : " + getPoint();
    }
}
