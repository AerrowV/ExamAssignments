import java.util.ArrayList;

public class Tournament {

    private ArrayList<String> players;

    public Tournament() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(String player) {
        this.players.add(player);
    }
}
