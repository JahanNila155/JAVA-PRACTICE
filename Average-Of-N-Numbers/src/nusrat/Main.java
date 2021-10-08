package nusrat;

 public class Main {

    public static void main(String[] args) {
        int n=5,result=0;
        int x[]=new int[5];

        x[0]=10;

        x[1]=15;

        x[2]=20;

        x[3]=25;

        x[4]=30;

        for(int i=0;i<n;i++)
            result=result+x[i];

        System.out.println("average of  ("+x[0]+","+x[1]+","+x[2]+","+x[3]+","+x[4]+")  is ="+result/n);
    }
}
