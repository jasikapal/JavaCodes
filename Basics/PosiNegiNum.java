import java.util.Scanner;

public class PosiNegiNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("positve");
        } else if (a < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
