package IPL;

import java.util.Scanner;

public class IPLManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the View
        PlayerView view = new PlayerView();

        // Create the Controller
        PlayerController controller = new PlayerController(view);

        System.out.println("Welcome to the IPL Player Management System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Player");
            System.out.println("2. Display All Players");
            System.out.println("3. Update Player");
            System.out.println("4. Find Top Scorer");
            System.out.println("5. Find Top Wicket-Taker");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Player
                    System.out.print("Enter Player ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Player Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Team: ");
                    String team = scanner.nextLine();
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter Runs: ");
                    int runs = scanner.nextInt();
                    System.out.print("Enter Wickets: ");
                    int wickets = scanner.nextInt();

                    controller.addPlayer(new Player(id, name, team, role, runs, wickets));
                    System.out.println("Player added successfully!");
                    break;

                case 2:
                    // Display All Players
                    System.out.println("All Players:");
                    controller.displayAllPlayers();
                    break;

                case 3:
                    // Update Player
                    System.out.print("Enter Player ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Team: ");
                    String newTeam = scanner.nextLine();
                    System.out.print("Enter New Role: ");
                    String newRole = scanner.nextLine();
                    System.out.print("Enter New Runs: ");
                    int newRuns = scanner.nextInt();
                    System.out.print("Enter New Wickets: ");
                    int newWickets = scanner.nextInt();

                    controller.updatePlayer(updateId, newName, newTeam, newRole, newRuns, newWickets);
                    break;

                case 4:
                    // Find Top Scorer
                    controller.findTopScorer();
                    break;

                case 5:
                    // Find Top Wicket-Taker
                    controller.findTopWicketTaker();
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the IPL Player Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
