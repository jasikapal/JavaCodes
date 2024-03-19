import java.util.Scanner;
public class QuoandRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend number:");
        int a=sc.nextInt();
        System.out.println("Enter divisor number:");
        int b=sc.nextInt();
        sc.close();
        double rem=a%b;
        double quo=a/b;
        System.out.println("remainder="+rem);
        System.out.println("quotient="+quo);
    }
}
