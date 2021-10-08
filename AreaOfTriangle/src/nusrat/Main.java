package nusrat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double x= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double y= s.nextDouble();

        //Area = (width*height)/2
        double area=(x*y)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
