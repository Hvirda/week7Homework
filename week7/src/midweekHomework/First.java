package midweekHomework;

import java.util.Scanner;

public class First {
    /*
    1. Take 10 integers from keyboard using loop and print their average value on the
screen.
     */
    public static void main(String[] args) {
        input();
    }
    public static void input(){
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int avg ;
        for(int i=0;i<10;i++){
            System.out.println("enter number");
            int n=sc.nextInt();
            sum=sum+n;

        }
        System.out.println("average of sum: "+(avg=sum/10));

    }
}
