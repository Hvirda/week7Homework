import java.util.Scanner;
public class Six {
    /*
    6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
| Salary Slip |
| |
| |
| Employee Id : 2564 |
| Employee Name : Jay |
|
|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|
|
| Gross Salary : 26750.0 |
|===========================|
     */

    public static void main(String[] args) {
    grossSalary();
    }
    public static void grossSalary(){

        Scanner sc1=new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        double id=sc1.nextInt();
        System.out.print("Employee Name: ");
        String name=sc1.next();
        System.out.print("Enter Basic Salary: ");
        double basicSalary=sc1.nextDouble();

        double HRA=(basicSalary*10) / 100;
        double TA=(basicSalary*8) / 100;
        double DA=(basicSalary*9) / 100;
        double PF=(basicSalary*20) / 100;
        double grossSalary= basicSalary + HRA+TA+DA-PF;


        System.out.println("|       Salary Slip           |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|Employee Id:    "+id+"       |");
        System.out.println("| Employee name:  "+name+"      |");
        System.out.println("|                             |");
        System.out.println("|                             |");

        System.out.println("|Basic Salary: "+basicSalary+"|");
        System.out.println("|HRA 10%:      "+String.format("%.2f",HRA)+"        |");
        System.out.println("|DA  9%:       "+String.format("%.2f",DA)+"         |");
        System.out.println("|TA  8%:       "+String.format("%.2f",TA)+"         |");
        System.out.println("|PF - 20&:      "+String.format("%.2f",PF)+"        |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|Gross Salary: "+String.format("%.2f",grossSalary)+"|");



    }
}
