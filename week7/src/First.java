import java.util.Scanner;

public class First {
    /*
    1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)

     */
    public static void main(String[] args) {
    oddEven();
    }
    public static void oddEven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a= sc.nextInt();
        String s1=(a%2==0)? "Number is even" : "Number is odd"; //to check number is odd or even
        System.out.println(s1);


        }
    }

