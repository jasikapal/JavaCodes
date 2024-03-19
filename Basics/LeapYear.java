import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        sc.close();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {

                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
    }
}
