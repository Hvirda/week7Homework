import java.util.Scanner;

public class Eight {
    /*
    8. Write a java program to get numbers from users and print whether it is positive or negative.
     */
    public static void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("number is negative");
        }else if(n>0){
            System.out.println("number is positive");
        }else {
            System.out.println("number is zero");
        }

    }

    public static void main(String[] args) {
        number();
    }
}
