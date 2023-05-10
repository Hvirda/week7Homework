package midweekHomework;

import java.util.Scanner;

public class Fifth {
    /*
    5. Take two int values from user and print greatest among them.
     */
    public static void main(String[] args) {
        greatest();
    }
    public static void greatest(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value");
        int a=sc.nextInt();
        System.out.println("enter second value");
        int b=sc.nextInt();
        if (a>b){
            System.out.println("a is greater");
        }else {
            System.out.println("b is greater");
        }
    }
}
