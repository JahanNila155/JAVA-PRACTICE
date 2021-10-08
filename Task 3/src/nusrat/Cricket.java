package nusrat;

public class Cricket extends Sports{
     /*
        Name: Nusrat Jahan
        ID: 2012020155
        Section: D
        Batch: 53rd
        Email: cse_2012020155@lus.ac.bd
        Date: 11.09.2021
     */

    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match Type: " +matchType);
        System.out.println("Over: " +over);
        System.out.println("Player Name: " +player.playerName);
        System.out.println("Jersey Number: " +player.jerseyNumber);
    }
}
