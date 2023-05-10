package midweekHomework;

import java.util.Scanner;

public class Sixth {
    /*
    6. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
     */
    public static void main(String[] args) {
        grade();
    }
    public static void grade(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int n=sc.nextInt();
        if (n>=0 && n<25){
            System.out.println("F");
        } else if (n>=25 && n<=45) {
            System.out.println("E");
        } else if (n>=45 && n<=50) {
            System.out.println("D");
        } else if (n>=50 && n<=60) {
            System.out.println("C");
        } else if (n>=60 && n<80) {
            System.out.println("B");
        } else if (n<=80 && n>=100){
            System.out.println("A");
        }else {
            System.out.println("please enter marks between 0 to 100");
        }
    }
}
