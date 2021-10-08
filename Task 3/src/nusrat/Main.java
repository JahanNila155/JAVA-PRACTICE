package nusrat;

public class Main {

    /*
        Name: Nusrat Jahan
        ID: 2012020155
        Section: D
        Batch: 53rd
        Email: cse_2012020155@lus.ac.bd
        Date: 11.09.2021
     */

        public static void main(String[] args) {
            Player player = new Player("Shakib", 75);
            Cricket cricket = new Cricket("International match", 20, player);
            cricket.display();
            Football football = new Football();
    }
}
