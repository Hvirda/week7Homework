public class TwentyTwo {
    /*
    22. Write a Java program to calculate the average value of array elements.
     */

    public static void main(String[] args) {
       avg();
    }
    public static void avg(){
        int a[]={2,5,7,8,9};
        int sum=0;
        int avg=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];               //sum of array value
            avg=sum/a.length;           // average of array value
        }
        System.out.println("sum of num is: "+sum);
        System.out.println("average of num is: "+avg);
    }
}
