package midweekHomework;

import java.util.Scanner;

public class seven {
    /*
    7. Take input of age of 3 people by user and determine oldest and youngest among
them.

     */
    public static void main(String[] args) {
        age();
    }
    public static void age(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ageof a1");
        int a1=sc.nextInt();
        System.out.println("enter age of a2");
        int a2=sc.nextInt();
        System.out.println("enter age of a3");
        int a3=sc.nextInt();
        
        if(a1>a2 && a1>a3){
            System.out.println("a1 is oldest");
        } else if (a2>a1 && a2>a3) {
            System.out.println("a2 is oldest");
        } else if (a3>a1 && a3>a1) {
            System.out.println("a3 is oldest");
        }if(a1<a2 && a1<a2){
            System.out.println("a1 is youngest");
        } else if (a2<a1&&a2<a3) {
            System.out.println("a2 is youngest");
        } else if (a3<a1&&a3<a1) {
            System.out.println("a3 is youngest");
        }


    }
}
