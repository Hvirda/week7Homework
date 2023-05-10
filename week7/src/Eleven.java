import java.util.Scanner;

public class Eleven {
    /*
    11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry
     */

    public static void city(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alphabet A to F");
        String alphabet=sc.next();

        if(alphabet.equalsIgnoreCase("A")){
            System.out.println("ahmedabad");
        } else if (alphabet.equals("B")) {
            System.out.println("Baroda");
        }
        else if (alphabet.equals("C")) {
            System.out.println("Chicago");
        }else if (alphabet.equals("D")) {
            System.out.println("Delhi");
        }else if (alphabet.equals("E")) {
            System.out.println("E");
        }else if (alphabet.equals("F")) {
            System.out.println("Fuzhou");
        }else {
            System.out.println("enter valid name");
        }

    }
    public static void main(String[] args) {
    city();
    }
}
