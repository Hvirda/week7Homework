import java.util.Scanner;

public class Five {
    /*
    5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 and 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 and 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
   |
|

Mark Sheet
 |
 |
|
|
|
Name
Roll No
: 08
: 23
J
a
y|
|
|
| |
| Subjects : Marks |
| |
| Math : 98 |
| Science: : 90 |
| English : : 85 |
| |
| Total : 273 |
| |
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
     */



    public static int getMarks(String subject) {
        int marks;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.print("Enter marks for " + subject + " ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Please enter marks between 0 to 100");
            } else {
                break;
            }
        } while (true);
        return marks;

    }

    public static double getPercentage(int total) {
        double percentage = (total * 100) / 300;
        return percentage;
    }

    public static String getResult(double percentage) {
        String result;
        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }
        return result;
    }

    public static String getGrade(double percentage) {
        String grade = "";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";

        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 30) {
            grade = "C";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        System.out.println("enter name");
        String name = sc.next();
        int marks1 = getMarks("English");
        int marks2 = getMarks("Maths");
        int marks3 = getMarks("Science");
        int total = marks1 + marks2 + marks3;
        double per = getPercentage(total);
        String result = getResult(per);
        String grade = getGrade(per);

        System.out.println("|_______________________________________________|");
        System.out.println("|                 Marksheet                      |");
        System.out.println("|                                               |");
        System.out.println("|Name         :"+rollno+ "                          |");
        System.out.println("|Roll No      :"+name+"                             |");
        System.out.println("|Roll No      :"+name+"                             |");
        System.out.println("|                                               |");
        System.out.println("|_______________________________________________|");
        System.out.println("|Subjects     :              Marks                  |");
        System.out.println("|_______________________________________________|");
        System.out.println("|English      :               "+marks1+"            |");
        System.out.println("|Maths        :               "+marks2+"            |");
        System.out.println("|Science      :               "+marks3+"            |");
        System.out.println("|                                               |");
        System.out.println("|_______________________________________________|");
        System.out.println("|Total        :               "+total+"           |");
        System.out.println("|_______________________________________________|");
        System.out.println("|Percentage   :               "+per+"              |");
        System.out.println("|Result       :              "+result+"            |");
        System.out.println("|Grade        :               "+grade+"            |");
        System.out.println("|_______________________________________________|");





    }
}
