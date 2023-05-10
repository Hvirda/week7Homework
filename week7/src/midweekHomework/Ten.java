package midweekHomework;

import java.util.Scanner;

public class Ten {
    /*
    10. Write a program to print the sum of two numbers entered by user by defining your
own method.
     */
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        int sum=(n1+n2);
        System.out.println("sum of two number is: "+sum);
    }
}
