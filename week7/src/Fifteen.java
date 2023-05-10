import java.util.Scanner;

public class Fifteen {
    /*
    15. Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {
        read();
    }

    public static void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");

        if (sc.hasNextInt()) {
            System.out.println("you have entered number");
        } else if (sc.hasNext()) {

            System.out.println("you have entered alphabet");

        } else  {
            System.out.println("enter valid input");

        }

    }
}
