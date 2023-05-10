import java.util.Scanner;

public class Seven {
    /*
    7. Write a java program to input any number and find out if it’s odd or even
     */
    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("number is even");

        }
        else {
            System.out.println("number is odd");
        }
}


}
