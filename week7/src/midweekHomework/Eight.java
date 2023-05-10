package midweekHomework;

import java.util.Scanner;

public class Eight {
    /*
    8. A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not
     */
    public static void main(String[] args) {
        attendance();
    }

    public static void attendance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of class held");
        int n1=sc.nextInt();
        System.out.println("Number of class attended");
        int n2=sc.nextInt();
        int pa=((n2*100)/n1);
        if (pa<75){
            System.out.println("you are  not allowed to sit in exam");
        }else {
            System.out.println("you are  allowed to sit in exam");
        }
    }
}
