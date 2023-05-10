import java.util.Scanner;

public class Nineteen {
    /*
    19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
     */
    public static void num(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("number is positive");
        } else if (n>0) {
            System.out.println("number is negative");

        }else {
            System.out.println("number is zero");
        }
    }

    public static void main(String[] args) {
        num();
    }
}
