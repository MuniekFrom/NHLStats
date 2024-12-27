
import java.util.ArrayList;
import java.util.Scanner;
import nhlstats.NHLStatistics;
import java.util.Collections;
import java.util.Comparator;


public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        ArrayList<Player> player = new ArrayList<>();

        player.add(new Player("Nathan MacKinnon","COL",57,14,43,20));
        player.add(new Player("Leon Draisaitl","EDM",52,24,28,10));
        player.add(new Player("Mikko Rantanen" , "COL", 52, 19 , 33, 22));
        player.add(new Player("Nikita Kucherov" , "TBL", 50, 15, 35, 17));
        player.add(new Player("Kirill Kaprizov", "MIN" , 50, 23, 27, 14));
        player.add(new Player("Connor McDavid" , "EDM" , 49, 15, 34, 10));
        player.add(new Player("Kyle Connor" , "WPG", 47, 21, 26, 17));
        player.add(new Player("Mitch Marner" , "TOR" , 46 , 10, 36, 8));
        player.add(new Player("Sam Reinhart" , "FLA", 45, 9, 36 , 6));
        player.add(new Player("Jack Eichel" , "VGK", 45, 14, 31 , 12));
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                System.out.println("Top 10 players sorted by points: ");

                for (Player players : player){
                    System.out.println(players.ShowPoints());
                }
                // Print the top ten players sorted by points.
            } else if (command.equals("goals")) {
                System.out.println("Top 10 players sorted by goals: ");

                //sortowanie graczy według goli w porządku malejącym

                Collections.sort(player, new Comparator<Player>(){
                    public int compare(Player p1, Player p2){
                        return Integer.compare(p2.goals, p1.goals);
                    }
                });

                // potrzebuje posortowania dla goli od największej do najmniejszej
                for (Player players : player){
                    System.out.println(players.ShowGoals());
                }
                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {

                Collections.sort(player, new Comparator<Player>(){
                    public int compare(Player p1, Player p2){
                        return Integer.compare(p2.assists,p1.assists);
                    }
                });
                for (Player players : player){
                    System.out.println(players.ShowAssists());
                }
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {

                Collections.sort(player, new Comparator<Player>(){

                    public int compare(Player p1, Player p2) {
                        return Integer.compare(p2.penalties,p1.penalties);
                    }
                });


                for (Player players : player){
                    System.out.println(players.ShowPenalties());
                }
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                System.out.print("Enter the player: ");
                String playername = reader.nextLine();

                boolean found = false;

                for (Player players : player){
                    if (playername.equalsIgnoreCase(players.name)){
                        System.out.println(players.PlayerStats());
                        found = true;
                        break;
                    }
                }
                if (!found){
                    System.out.println("Player not found");
                }



            } else if (command.equals("club")) {
                System.out.print("Enter the club: ");
                String clubplayer = reader.nextLine();
                boolean found = false;

                for(Player players : player){
                    if(clubplayer.equalsIgnoreCase(players.club)){
                        System.out.println(players.PlayerStats());
                        found = true;
                    }
                }
                if (!found){
                    System.out.println("Club not found");
                }

            }

        }

    }
}
