package IPL;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> players = new ArrayList<>();
    private PlayerView view;

    // Constructor
    public PlayerController(PlayerView view) {
        this.view = view;
    }

    // Add a new player
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Update an existing player's details
    public void updatePlayer(int id, String name, String team, String role, int runs, int wickets) {
        for (Player player : players) {
            if (player.getId() == id) {
                player.setName(name);
                player.setTeam(team);
                player.setRole(role);
                player.setRuns(runs);
                player.setWickets(wickets);
                System.out.println("Player details updated!");
                return;
            }
        }
        System.out.println("Player not found!");
    }

    // Display all players
    public void displayAllPlayers() {
        for (Player player : players) {
            view.displayPlayerDetails(player);
        }
    }

    // Find the top scorer
    public void findTopScorer() {
        if (players.isEmpty()) {
            System.out.println("No players available!");
            return;
        }

        Player topScorer = players.get(0);
        for (Player player : players) {
            if (player.getRuns() > topScorer.getRuns()) {
                topScorer = player;
            }
        }
        view.displayTopPlayer("Top Scorer", topScorer);
    }

    // Find the top wicket-taker
    public void findTopWicketTaker() {
        if (players.isEmpty()) {
            System.out.println("No players available!");
            return;
        }

        Player topWicketTaker = players.get(0);
        for (Player player : players) {
            if (player.getWickets() > topWicketTaker.getWickets()) {
                topWicketTaker = player;
            }
        }
        view.displayTopPlayer("Top Wicket-Taker", topWicketTaker);
    }
}
