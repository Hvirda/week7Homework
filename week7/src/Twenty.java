import java.util.Arrays;

public class Twenty {
    /*
    20. Write a Java program to sort a numeric array and a string array.

     */
    public static void main(String[] args) {
        array1();
    }
    public static void array1(){
        int a[]={3,7,8,4,6};
        String s[]={"selenium","java","postman"};
        Arrays.sort(a);
        System.out.println("sorting number "+Arrays.toString(a));
        Arrays.sort(s);
        System.out.println("sorting string "+Arrays.toString(s));

    }
}
