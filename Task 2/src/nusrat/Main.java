package nusrat;

public class Main {

    public static void main(String[] args) {

    /*  Name : Nusrat Jahan
        Id   : 2012020155
        Section : D
        E-mail : cse_2012020155@lus.ac.bd
        Date : 07/08/2021
    */
            Student st1 = new Student();
            Student.universityName="Leading University";

            Student st2 = new Student("Nusrat Jahan");
            Student st3 = new Student (2012020155);
            st1.display();

        }
}
