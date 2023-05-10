public class TwentyOne {
    /*
    21. Write a Java program to sum values of an array.
     */
    public static void sum() {
        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {  //to print sum of each array value
            sum = sum + a[i];
        }
        System.out.println("sum of array is: "+sum);
    }

    public static void main(String[] args) {
        sum();
    }
}
