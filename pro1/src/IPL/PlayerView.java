package IPL;

public class PlayerView {
    public void displayPlayerDetails(Player player) {
        System.out.println("Player Details:");
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
       
    }

    public void displayTopPlayer(String title, Player player) {
        System.out.println(title + ":");
        displayPlayerDetails(player);
    }
}
