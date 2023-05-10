import java.util.Scanner;

public class Twelve {
    /*
    11. Input any alphabet from “A" to “F” and print their city name accordingly (use switch) ifany
other alphabet should be invalid entry
     */
    public static void city(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any characters between A to F: ");
        String s=sc.next();
        char country = s.charAt(0);
        switch (country){
            case 'A':
                System.out.println("America");
            break;
            case 'B':
                System.out.println("Belgium");
                break;
            case 'C':
                System.out.println("China");
                break;
            case 'D':
                System.out.println("Dubai");
                break;
            case 'E':
                System.out.println("Egypt");
                break;
            case 'F':
                System.out.println("France");
                break;
        }

    }
    public static void main(String[] args) {
        city();
    }
}
