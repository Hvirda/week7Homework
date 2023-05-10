import java.util.Scanner;

public class TwentySix {
    /*
    26. Write a Java program to reverse a word.
Sample Output:
 Input a word: dsaf
 Reverse word: fasd
     */
    public static void main(String[] args) {
    print1();
    }
    public static void print1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
        String s2=" ";
        for (int i=0;i<s1.length();i++){
             s2=s1.charAt(i)+s2;         //to reverse string
        }
        System.out.println(s2);
    }

}
