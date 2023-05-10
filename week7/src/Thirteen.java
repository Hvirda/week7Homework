import java.util.Scanner;

public class Thirteen {
    /*
    13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
     */
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /)");
        char symbol = sc.next().charAt(0);
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        if (symbol == '+') {
            System.out.println("Addition is: " + addition);
        } else if (symbol == '-') {
            System.out.println("Subtraction is: " + subtraction);
        }else if (symbol=='*'){
            System.out.println("Multiplication is: "+multiplication);
        } else if (symbol=='/') {
            System.out.println("Division is: "+division);

        }
    }
}


