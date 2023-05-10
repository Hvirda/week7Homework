package midweekHomework;

public class Second {
    /*
    2. Print multiplication table of 24, 50 and 29 using loop
     */
    public static void main(String[] args) {
        table();
    }
    public static void table(){
        for(int i=1;i<=10;i++){
            System.out.println(""+(i*24));
        }
        for(int i=1;i<=10;i++){
            System.out.println(" "+(i*50));
        }
        for(int i=1;i<=10;i++){
            System.out.println(""+(i*29));
        }
    }
}
