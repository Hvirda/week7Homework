import java.util.Scanner;

public class Ten {
    /*
    10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
 Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%
    */
    public static void commision(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int id=sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();

        Scanner sc2=new Scanner(System.in);
        System.out.println("enter salary amount");
        int amount=sc.nextInt();

        Scanner sc3=new Scanner(System.in);
        System.out.println("enter salary basic ");
        int basic=sc3.nextInt();


        if(amount>=50000){
            System.out.println("you got 35% commision on sell,so you have make: "+(amount*35)/100);
        } else if (amount>=30000) {
            System.out.println("u got 20% commision on sell,so you have make: "+(amount*20)/100);
        } else if (amount>=20000) {
            System.out.println("u got 10% commision on sell,so you have make:"+(amount*10)/100);
        }
        else if (amount>=10000){
            System.out.println("u got 5% commision on sell,so you have make:"+(amount*5)/100);
        }else if(amount<10000){
            System.out.println("u got 2% commision on sell,so you have make:"+(amount*2)/100);
        }else {
            System.out.println("u dint get any commition on sell,so you have make:");
        }


    }
    public static void main(String[] args) {
        commision();
    }

}

