public class Fouteen {
    /*
    14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately
     */
    public static void main(String[] args) {
        num();
    }

    public static void num() {
        System.out.println("number divisable by 3: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("number divisable by 5: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("num not divisable by 5 and 3 are: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 != 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }

    }
}
