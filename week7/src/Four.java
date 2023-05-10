import java.util.Scanner;

public class Four {
    /*
    4. Write if else condition and print your group name in console else others group name
     */
    public static void main(String[] args) {
        group();
    }
    public static void group(){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        //String s2="Postman";
        if(s1.contains("selenium")){
            System.out.println("selenium");
        }else {
            System.out.println("postman");
        }

    }
}
