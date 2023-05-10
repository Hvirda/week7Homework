package midweekHomework;

import java.util.Scanner;

public class Four {
    /*
    4. Take values of length and breadth of a rectangle from user and check if it is square or not.
     */
    public static void main(String[] args) {
        square();
    }
    public static void square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter breadth");
        double breadth=sc.nextDouble();
        System.out.println("enter length");
        double length=sc.nextDouble();
        if (breadth==length){
            System.out.println("It is a square");
        }else {
            System.out.println("It is not a square");
        }

    }
}
