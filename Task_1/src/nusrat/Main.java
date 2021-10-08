package nusrat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	{
/* Nusrat Jahan
    Id   : 2012020155
    Section : D
    E-mail : cse_2012020155@lus.ac.bd
    Date : 15-07-2021
            */
                Scanner input = new Scanner(System.in);
                String section;
                System.out.println("Enter section : ");
                section = input.nextLine();
                System.out.println("section:"+section);

                Info myInfo = new Info();
                System.out.println("Name: "+myInfo.name);
                System.out.println("Id: "+myInfo.id);

                Hobby myHobby = new Hobby();
                System.out.println("Hobby: "+myHobby.hobbyName);


            }
        }
}
