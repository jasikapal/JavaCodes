import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 1st number:");
        int b=sc.nextInt();
        sc.close();
        int p=a*b;
        System.out.println(p);
}
}