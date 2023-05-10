package midweekHomework;

import java.util.Scanner;

public class Nine {
    /*
    9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

     */
    public static void main(String[] args) {
        attendance();
    }

    public static void attendance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of class held");
        int n1 = sc.nextInt();
        System.out.println("Number of class attended");
        int n2 = sc.nextInt();
        int pa = ((n2 * 100) / n1);

        if (pa < 75) {
            System.out.println("Do you have medical cause");
            System.out.println("enter your choice");
            String choice = sc.next();
            switch (choice) {
                case "Y":
                    System.out.println("you are allowed to sit in exam");
                    break;
                case "N":
                    System.out.println("you are not allowed to sit in exam");
                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        } else {
            System.out.println("you are  allowed to sit in exam");
        }
    }
}
