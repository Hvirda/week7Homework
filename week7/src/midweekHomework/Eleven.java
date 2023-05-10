package midweekHomework;

import java.util.Scanner;

public class Eleven {
    /*
    11. Write a program to print a string entered by user.
     */
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
        System.out.println(s1);
    }
}
